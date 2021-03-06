package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=add_client, returns=null, data={protocol=str, fdname=str, *skipauth=bool, *tls=bool}}</pre></p>
 */
// QApiCommandDescriptor{name=add_client, returns=null, data={protocol=str, fdname=str, *skipauth=bool, *tls=bool}}
public class AddClientCommand extends QApiCommand<AddClientCommand.Arguments, AddClientCommand.Response> {
	/** Compound arguments to a AddClientCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("protocol")
		@Nonnull
		public java.lang.String protocol;
		@JsonProperty("fdname")
		@Nonnull
		public java.lang.String fdname;
		@JsonProperty("skipauth")
		@CheckForNull
		public java.lang.Boolean skipauth;
		@JsonProperty("tls")
		@CheckForNull
		public java.lang.Boolean tls;

		public Arguments() {
		}

		public Arguments(java.lang.String protocol, java.lang.String fdname, java.lang.Boolean skipauth, java.lang.Boolean tls) {
			this.protocol = protocol;
			this.fdname = fdname;
			this.skipauth = skipauth;
			this.tls = tls;
		}
	}

	/** Response to a AddClientCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new AddClientCommand. */
	public AddClientCommand(@Nonnull AddClientCommand.Arguments argument) {
		super("add_client", Response.class, argument);
	}

	/** Constructs a new AddClientCommand. */
	public AddClientCommand(java.lang.String protocol, java.lang.String fdname, java.lang.Boolean skipauth, java.lang.Boolean tls) {
		this(new Arguments(protocol, fdname, skipauth, tls));
	}
}
