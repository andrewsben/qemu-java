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
 * <p><pre>QApiTypeDescriptor{name=ChardevSpiceChannel, data={type=str}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ChardevSpiceChannel, data={type=str}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevSpiceChannel extends QApiType {

	@JsonProperty("type")
	@Nonnull
	public java.lang.String type;

	@Nonnull
	public ChardevSpiceChannel withType(java.lang.String value) {
		this.type = value;
		return this;
	}

	public ChardevSpiceChannel() {
	}

	public ChardevSpiceChannel(java.lang.String type) {
		this.type = type;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("type");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("type".equals(name))
			return type;
		return super.getFieldByName(name);
	}
}