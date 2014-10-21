QEmu API for Java
=================

This package consists of three major modules for manipulating and
managing QEmu virtual machines from Java. They are:

* qemu-exec: Command line execution.
* qemu-qapi: Interface to running VMs.
* qemu-manager: Manager and registry of running VMs.

Executing QEmu (qemu-exec)
--------------------------

This module allows the user to build a QEmu command line and start
a subprocess.  Both raw command line options and common recipes for
interdependent option-sets are provided.  The objective is to provide
an assurance of a correct command line using Java type safety and
these builtin recipes.

	QEmuIdAllocator allocator = new QEmuIdAllocator();
	QEmuCommandLine commandLine = new QEmuCommandLine(QEmuArchitecture.x86_64);
	commandLine.addOptions(
		new QEmuMemoryOption(1, QEmuMemoryOption.Magnitude.GIGA),
		new QEmuCpusOption(2).withSockets(2).withCores(1).withThreads(1),
		new QEmuVirtioDriveRecipe(allocator, "/var/tmp/qemu/sys-1/vda").withFormat(Format.raw).withCache(Cache.unsafe),
		new QEmuVirtioNetRecipe(allocator).withMac("08:00:20:c0:ff:ee")
	);
	Process process = commandLine.exec();

Some options are deprecated or historic; we have preferred the
more modern variants of options in all cases. Here is a partial
translation table:

* -hda -> new QEmuVirtioDriveRecipe() (or new QEmuDeviceOption())
* -enable-kvm -> new QEmuMachineOption().withAcceleration(Acceleration.kvm, Acceleration.tcg)
* -net nic/-net tap -> new QEmuVirtioNetRecipe() (or new QEmuNetdevOption())

Manipulating QEmu (qemu-qapi)
-----------------------------

QApi is a JSON-based remote control protocol for a running QEmu
process. The protocol is defined in a file called qemu-schema.json
in the qemu 1.7 or later source trees.  This package generates a set
of Java API classes from the JSON schema, so that a Java-based client
can use QApi directly.

    QApiConnection connection = new QApiConnection(...);
    CpuInfo info = connection.call(new QueryCpusCommand());

It is the job of the user to provide an appropriate InetSocketAddress
for the QApiConnection. Or you could use qemu-manager:

Managing QEmu Processes (qemu-manager)
--------------------------------------

[QEmuManager.java](qemu-manager/src/main/java/org/anarres/qemu/manager/QEmuManager.java)
will execute a QEmuCommandLine, construct a QApiConnection to the
newly created virtual machine, and return it to the user.

	QEmuManager manager = new QEmuManager();
	...
	QEmuCommandLine commandLine = ...
	QEmuProcess process = manager.execute(commandLine);
	QApiConnection connection = process.getConnection();
	connection.call(...);

API Documentation
-----------------

The [JavaDoc is available](http://shevek.github.io/qemu-java/docs/javadoc/).

Building
--------

This is a standard gradle build: Run

    ./gradlew build

If QEmu updates its protocol, you can regenerate the sources from
the original JSON schema:

    ./gradlew generate build

By default, this will fetch the JSON schema from the master branch
of qemu's github. To specify an alternate location, add:

    args = [ "--input", "<file|http[s]>://...." ]

to the generate task in build.gradle. See
[generator/Main.java](qemu-qapi/src/generate/java/org/anarres/qemu/qapi/generator/Main.java)
for more details.

