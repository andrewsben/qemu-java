package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=pmemsave, returns=null, data={val=int, size=int, filename=str}}</pre></p>
 */
// QApiCommandDescriptor{name=pmemsave, returns=null, data={val=int, size=int, filename=str}}
public class PmemsaveCommand extends QApiCommand<PmemsaveCommand.Arguments, PmemsaveCommand.Response> {
	/** Compound arguments to a PmemsaveCommand. */
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

		public Arguments() {
		}

		public Arguments(long val, long size, java.lang.String filename) {
			this.val = val;
			this.size = size;
			this.filename = filename;
		}
	}

	/** Response to a PmemsaveCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new PmemsaveCommand. */
	public PmemsaveCommand(@Nonnull PmemsaveCommand.Arguments argument) {
		super("pmemsave", Response.class, argument);
	}

	/** Constructs a new PmemsaveCommand. */
	public PmemsaveCommand(long val, long size, java.lang.String filename) {
		this(new Arguments(val, size, filename));
	}
}