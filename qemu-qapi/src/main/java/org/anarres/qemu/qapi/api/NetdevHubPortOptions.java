package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=NetdevHubPortOptions, data={hubid=int32}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=NetdevHubPortOptions, data={hubid=int32}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class NetdevHubPortOptions extends QApiType {

	@JsonProperty("hubid")
	@Nonnull
	public int hubid;

	@Nonnull
	public NetdevHubPortOptions withHubid(int value) {
		this.hubid = value;
		return this;
	}

	public NetdevHubPortOptions() {
	}

	public NetdevHubPortOptions(int hubid) {
		this.hubid = hubid;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("hubid");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("hubid".equals(name))
			return hubid;
		return super.getFieldByName(name);
	}
}
