package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-events, returns=[EventInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-events, returns=[EventInfo], data=null}
public class QueryEventsCommand extends QApiCommand<java.lang.Void, QueryEventsCommand.Response> {

	/** Response to a QueryEventsCommand. */
	public static class Response extends QApiResponse<java.util.List<EventInfo>> {
	}

	/** Constructs a new QueryEventsCommand. */
	public QueryEventsCommand() {
		super("query-events", Response.class, null);
	}

}
