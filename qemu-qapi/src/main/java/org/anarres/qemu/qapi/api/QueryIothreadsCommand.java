package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-iothreads, returns=[IOThreadInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-iothreads, returns=[IOThreadInfo], data=null}
public class QueryIothreadsCommand extends QApiCommand<java.lang.Void, QueryIothreadsCommand.Response> {

	/** Response to a QueryIothreadsCommand. */
	public static class Response extends QApiResponse<java.util.List<IOThreadInfo>> {
	}

	/** Constructs a new QueryIothreadsCommand. */
	public QueryIothreadsCommand() {
		super("query-iothreads", Response.class, null);
	}

}
