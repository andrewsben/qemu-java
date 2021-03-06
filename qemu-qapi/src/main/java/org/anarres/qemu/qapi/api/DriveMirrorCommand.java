package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=drive-mirror, returns=null, data={device=str, target=str, *format=str, *node-name=str, *replaces=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *granularity=uint32, *buf-size=int, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError}}</pre></p>
 */
// QApiCommandDescriptor{name=drive-mirror, returns=null, data={device=str, target=str, *format=str, *node-name=str, *replaces=str, sync=MirrorSyncMode, *mode=NewImageMode, *speed=int, *granularity=uint32, *buf-size=int, *on-source-error=BlockdevOnError, *on-target-error=BlockdevOnError}}
public class DriveMirrorCommand extends QApiCommand<DriveMirrorCommand.Arguments, DriveMirrorCommand.Response> {
	/** Compound arguments to a DriveMirrorCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("device")
		@Nonnull
		public java.lang.String device;
		@JsonProperty("target")
		@Nonnull
		public java.lang.String target;
		@JsonProperty("format")
		@CheckForNull
		public java.lang.String format;
		@JsonProperty("node-name")
		@CheckForNull
		public java.lang.String nodeName;
		@JsonProperty("replaces")
		@CheckForNull
		public java.lang.String replaces;
		@JsonProperty("sync")
		@Nonnull
		public MirrorSyncMode sync;
		@JsonProperty("mode")
		@CheckForNull
		public NewImageMode mode;
		@JsonProperty("speed")
		@CheckForNull
		public java.lang.Long speed;
		@JsonProperty("granularity")
		@CheckForNull
		public java.lang.Long granularity;
		@JsonProperty("buf-size")
		@CheckForNull
		public java.lang.Long bufSize;
		@JsonProperty("on-source-error")
		@CheckForNull
		public BlockdevOnError onSourceError;
		@JsonProperty("on-target-error")
		@CheckForNull
		public BlockdevOnError onTargetError;

		public Arguments() {
		}

		public Arguments(java.lang.String device, java.lang.String target, java.lang.String format, java.lang.String nodeName, java.lang.String replaces, MirrorSyncMode sync, NewImageMode mode, java.lang.Long speed, java.lang.Long granularity, java.lang.Long bufSize, BlockdevOnError onSourceError, BlockdevOnError onTargetError) {
			this.device = device;
			this.target = target;
			this.format = format;
			this.nodeName = nodeName;
			this.replaces = replaces;
			this.sync = sync;
			this.mode = mode;
			this.speed = speed;
			this.granularity = granularity;
			this.bufSize = bufSize;
			this.onSourceError = onSourceError;
			this.onTargetError = onTargetError;
		}
	}

	/** Response to a DriveMirrorCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new DriveMirrorCommand. */
	public DriveMirrorCommand(@Nonnull DriveMirrorCommand.Arguments argument) {
		super("drive-mirror", Response.class, argument);
	}

	/** Constructs a new DriveMirrorCommand. */
	public DriveMirrorCommand(java.lang.String device, java.lang.String target, java.lang.String format, java.lang.String nodeName, java.lang.String replaces, MirrorSyncMode sync, NewImageMode mode, java.lang.Long speed, java.lang.Long granularity, java.lang.Long bufSize, BlockdevOnError onSourceError, BlockdevOnError onTargetError) {
		this(new Arguments(device, target, format, nodeName, replaces, sync, mode, speed, granularity, bufSize, onSourceError, onTargetError));
	}
}
