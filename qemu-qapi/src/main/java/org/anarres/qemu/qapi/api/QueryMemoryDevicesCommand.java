package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-memory-devices, returns=[MemoryDeviceInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-memory-devices, returns=[MemoryDeviceInfo], data=null}
public class QueryMemoryDevicesCommand extends QApiCommand<java.lang.Void, QueryMemoryDevicesCommand.Response> {

	/** Response to a QueryMemoryDevicesCommand. */
	public static class Response extends QApiResponse<java.util.List<MemoryDeviceInfo>> {
	}

	/** Constructs a new QueryMemoryDevicesCommand. */
	public QueryMemoryDevicesCommand() {
		super("query-memory-devices", Response.class, null);
	}

}
