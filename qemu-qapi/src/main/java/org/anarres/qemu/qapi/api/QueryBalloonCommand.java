package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-balloon, returns=BalloonInfo, data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-balloon, returns=BalloonInfo, data=null}
public class QueryBalloonCommand extends QApiCommand<java.lang.Void, QueryBalloonCommand.Response> {

	/** Response to a QueryBalloonCommand. */
	public static class Response extends QApiResponse<BalloonInfo> {
	}

	/** Constructs a new QueryBalloonCommand. */
	public QueryBalloonCommand() {
		super("query-balloon", Response.class, null);
	}

}
