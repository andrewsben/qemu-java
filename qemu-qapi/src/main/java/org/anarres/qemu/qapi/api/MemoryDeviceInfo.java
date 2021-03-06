package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiUnionDescriptor{name=MemoryDeviceInfo, data={dimm=PCDIMMDeviceInfo}, innerTypes=null, fields=null, discriminatorField=null}</pre></p>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MemoryDeviceInfo extends QApiType implements QApiUnion {
	public static enum Discriminator {
		dimm,
		__NONE;
	}

	@Nonnull
	@JsonProperty("type")
	public Discriminator type;

	@Nonnull
	public final Discriminator getType() {
		return type;
	}

	// union {
	@JsonProperty("dimm")
	@JsonUnwrapped
	@CheckForNull
	public PCDIMMDeviceInfo dimm;
	// }

	@Nonnull
	public static MemoryDeviceInfo dimm(@Nonnull PCDIMMDeviceInfo dimm) {
		MemoryDeviceInfo self = new MemoryDeviceInfo();
		self.type = Discriminator.dimm;
		self.dimm = dimm;
		return self;
	}

	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("dimm");
		return names;
	}

	@JsonIgnore
	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("dimm".equals(name))
			return dimm;
		return super.getFieldByName(name);
	}

	@Override
	@JsonIgnore
	public boolean isValidUnion() {
		int count = 0;
		if (dimm != null)
			count++;
		return (count == 1);
	}
}
