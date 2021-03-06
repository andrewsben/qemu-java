package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=migrate, returns=null, data={uri=str, *blk=bool, *inc=bool, *detach=bool}}</pre></p>
 */
// QApiCommandDescriptor{name=migrate, returns=null, data={uri=str, *blk=bool, *inc=bool, *detach=bool}}
public class MigrateCommand extends QApiCommand<MigrateCommand.Arguments, MigrateCommand.Response> {
	/** Compound arguments to a MigrateCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("uri")
		@Nonnull
		public java.lang.String uri;
		@JsonProperty("blk")
		@CheckForNull
		public java.lang.Boolean blk;
		@JsonProperty("inc")
		@CheckForNull
		public java.lang.Boolean inc;
		@JsonProperty("detach")
		@CheckForNull
		public java.lang.Boolean detach;

		public Arguments() {
		}

		public Arguments(java.lang.String uri, java.lang.Boolean blk, java.lang.Boolean inc, java.lang.Boolean detach) {
			this.uri = uri;
			this.blk = blk;
			this.inc = inc;
			this.detach = detach;
		}
	}

	/** Response to a MigrateCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new MigrateCommand. */
	public MigrateCommand(@Nonnull MigrateCommand.Arguments argument) {
		super("migrate", Response.class, argument);
	}

	/** Constructs a new MigrateCommand. */
	public MigrateCommand(java.lang.String uri, java.lang.Boolean blk, java.lang.Boolean inc, java.lang.Boolean detach) {
		this(new Arguments(uri, blk, inc, detach));
	}
}
