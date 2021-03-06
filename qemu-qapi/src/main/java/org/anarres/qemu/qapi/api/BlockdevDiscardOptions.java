package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=BlockdevDiscardOptions, data=[ignore, unmap], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=BlockdevDiscardOptions, data=[ignore, unmap], fields=null}
public enum BlockdevDiscardOptions {
	// @JsonProperty("ignore")
	ignore("ignore"),
	// @JsonProperty("unmap")
	unmap("unmap"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlockdevDiscardOptions(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
