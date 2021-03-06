package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiEnumDescriptor{name=BlockJobType, data=[commit, stream, mirror, backup], fields=null}</pre></p>
 */
// QApiEnumDescriptor{name=BlockJobType, data=[commit, stream, mirror, backup], fields=null}
public enum BlockJobType {
	// @JsonProperty("commit")
	commit("commit"),
	// @JsonProperty("stream")
	stream("stream"),
	// @JsonProperty("mirror")
	mirror("mirror"),
	// @JsonProperty("backup")
	backup("backup"),
	__UNKNOWN("<unknown>");

	private final java.lang.String jsonValue;

	/* pp */ BlockJobType(@Nonnull java.lang.String jsonValue) {
		this.jsonValue = jsonValue;
	}

	@JsonValue
	public java.lang.String getJsonValue() {
		return jsonValue;
	}
}
