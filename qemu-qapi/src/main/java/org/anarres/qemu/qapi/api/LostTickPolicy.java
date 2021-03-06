package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=LostTickPolicy, data=[discard, delay, merge, slew], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=LostTickPolicy, data=[discard, delay, merge, slew], fields=null}
public enum LostTickPolicy {
	// @JsonProperty("discard")
	discard("discard"),
	// @JsonProperty("delay")
	delay("delay"),
	// @JsonProperty("merge")
	merge("merge"),
	// @JsonProperty("slew")
	slew("slew"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ LostTickPolicy(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
