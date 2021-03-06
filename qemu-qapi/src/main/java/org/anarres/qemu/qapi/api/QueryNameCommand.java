package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-name, returns=NameInfo, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-name, returns=NameInfo, data=null}
public class QueryNameCommand extends QApiCommand<java.lang.Void, QueryNameCommand.Response> {

	/** Response to a QueryNameCommand. */
	public static class Response extends QApiResponse<NameInfo> {
	}

	/** Constructs a new QueryNameCommand. */
	public QueryNameCommand() {
		super("query-name", Response.class, null);
	}

}
