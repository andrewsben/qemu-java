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
 * <p><pre>QApiTypeDescriptor{name=BlockdevOptionsBase, data={driver=BlockdevDriver, *id=str, *node-name=str, *discard=BlockdevDiscardOptions, *cache=BlockdevCacheOptions, *aio=BlockdevAioOptions, *rerror=BlockdevOnError, *werror=BlockdevOnError, *read-only=bool, *detect-zeroes=BlockdevDetectZeroesOptions}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevOptionsBase, data={driver=BlockdevDriver, *id=str, *node-name=str, *discard=BlockdevDiscardOptions, *cache=BlockdevCacheOptions, *aio=BlockdevAioOptions, *rerror=BlockdevOnError, *werror=BlockdevOnError, *read-only=bool, *detect-zeroes=BlockdevDetectZeroesOptions}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsBase extends QApiType {

	@JsonProperty("driver")
	@Nonnull
	public BlockdevDriver driver;
	@JsonProperty("id")
	@CheckForNull
	public java.lang.String id;
	@JsonProperty("node-name")
	@CheckForNull
	public java.lang.String nodeName;
	@JsonProperty("discard")
	@CheckForNull
	public BlockdevDiscardOptions discard;
	@JsonProperty("cache")
	@CheckForNull
	public BlockdevCacheOptions cache;
	@JsonProperty("aio")
	@CheckForNull
	public BlockdevAioOptions aio;
	@JsonProperty("rerror")
	@CheckForNull
	public BlockdevOnError rerror;
	@JsonProperty("werror")
	@CheckForNull
	public BlockdevOnError werror;
	@JsonProperty("read-only")
	@CheckForNull
	public java.lang.Boolean readOnly;
	@JsonProperty("detect-zeroes")
	@CheckForNull
	public BlockdevDetectZeroesOptions detectZeroes;

	@Nonnull
	public BlockdevOptionsBase withDriver(BlockdevDriver value) {
		this.driver = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withId(java.lang.String value) {
		this.id = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withNodeName(java.lang.String value) {
		this.nodeName = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withDiscard(BlockdevDiscardOptions value) {
		this.discard = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withCache(BlockdevCacheOptions value) {
		this.cache = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withAio(BlockdevAioOptions value) {
		this.aio = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withRerror(BlockdevOnError value) {
		this.rerror = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withWerror(BlockdevOnError value) {
		this.werror = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withReadOnly(java.lang.Boolean value) {
		this.readOnly = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsBase withDetectZeroes(BlockdevDetectZeroesOptions value) {
		this.detectZeroes = value;
		return this;
	}

	public BlockdevOptionsBase() {
	}

	public BlockdevOptionsBase(BlockdevDriver driver, java.lang.String id, java.lang.String nodeName, BlockdevDiscardOptions discard, BlockdevCacheOptions cache, BlockdevAioOptions aio, BlockdevOnError rerror, BlockdevOnError werror, java.lang.Boolean readOnly, BlockdevDetectZeroesOptions detectZeroes) {
		this.driver = driver;
		this.id = id;
		this.nodeName = nodeName;
		this.discard = discard;
		this.cache = cache;
		this.aio = aio;
		this.rerror = rerror;
		this.werror = werror;
		this.readOnly = readOnly;
		this.detectZeroes = detectZeroes;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("driver");
		names.add("id");
		names.add("node-name");
		names.add("discard");
		names.add("cache");
		names.add("aio");
		names.add("rerror");
		names.add("werror");
		names.add("read-only");
		names.add("detect-zeroes");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("driver".equals(name))
			return driver;
		if ("id".equals(name))
			return id;
		if ("node-name".equals(name))
			return nodeName;
		if ("discard".equals(name))
			return discard;
		if ("cache".equals(name))
			return cache;
		if ("aio".equals(name))
			return aio;
		if ("rerror".equals(name))
			return rerror;
		if ("werror".equals(name))
			return werror;
		if ("read-only".equals(name))
			return readOnly;
		if ("detect-zeroes".equals(name))
			return detectZeroes;
		return super.getFieldByName(name);
	}
}
