package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=inject-nmi, returns=null, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=inject-nmi, returns=null, data=null}
public class InjectNmiCommand extends QApiCommand<java.lang.Void, InjectNmiCommand.Response> {

	/** Response to a InjectNmiCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new InjectNmiCommand. */
	public InjectNmiCommand() {
		super("inject-nmi", Response.class, null);
	}

}
