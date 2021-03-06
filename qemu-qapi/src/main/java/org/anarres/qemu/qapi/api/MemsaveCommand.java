package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=memsave, returns=null, data={val=int, size=int, filename=str, *cpu-index=int}}</pre></p>
 */
// QApiCommandDescriptor{name=memsave, returns=null, data={val=int, size=int, filename=str, *cpu-index=int}}
public class MemsaveCommand extends QApiCommand<MemsaveCommand.Arguments, MemsaveCommand.Response> {
	/** Compound arguments to a MemsaveCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("val")
		@Nonnull
		public long val;
		@JsonProperty("size")
		@Nonnull
		public long size;
		@JsonProperty("filename")
		@Nonnull
		public java.lang.String filename;
		@JsonProperty("cpu-index")
		@CheckForNull
		public java.lang.Long cpuIndex;

		public Arguments() {
		}

		public Arguments(long val, long size, java.lang.String filename, java.lang.Long cpuIndex) {
			this.val = val;
			this.size = size;
			this.filename = filename;
			this.cpuIndex = cpuIndex;
		}
	}

	/** Response to a MemsaveCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MemsaveCommand. */
	public MemsaveCommand(@Nonnull MemsaveCommand.Arguments argument) {
		super("memsave", Response.class, argument);
	}

	/** Constructs a new MemsaveCommand. */
	public MemsaveCommand(long val, long size, java.lang.String filename, java.lang.Long cpuIndex) {
		this(new Arguments(val, size, filename, cpuIndex));
	}
}
