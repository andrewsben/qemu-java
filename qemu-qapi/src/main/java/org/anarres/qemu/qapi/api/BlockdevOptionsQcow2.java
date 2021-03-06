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
 * <p><pre>QApiTypeDescriptor{name=BlockdevOptionsQcow2, data={*lazy-refcounts=bool, *pass-discard-request=bool, *pass-discard-snapshot=bool, *pass-discard-other=bool, *overlap-check=Qcow2OverlapChecks, *cache-size=int, *l2-cache-size=int, *refcount-cache-size=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=BlockdevOptionsQcow2, data={*lazy-refcounts=bool, *pass-discard-request=bool, *pass-discard-snapshot=bool, *pass-discard-other=bool, *overlap-check=Qcow2OverlapChecks, *cache-size=int, *l2-cache-size=int, *refcount-cache-size=int}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BlockdevOptionsQcow2 extends BlockdevOptionsGenericCOWFormat {

	@JsonProperty("lazy-refcounts")
	@CheckForNull
	public java.lang.Boolean lazyRefcounts;
	@JsonProperty("pass-discard-request")
	@CheckForNull
	public java.lang.Boolean passDiscardRequest;
	@JsonProperty("pass-discard-snapshot")
	@CheckForNull
	public java.lang.Boolean passDiscardSnapshot;
	@JsonProperty("pass-discard-other")
	@CheckForNull
	public java.lang.Boolean passDiscardOther;
	@JsonProperty("overlap-check")
	@CheckForNull
	public Qcow2OverlapChecks overlapCheck;
	@JsonProperty("cache-size")
	@CheckForNull
	public java.lang.Long cacheSize;
	@JsonProperty("l2-cache-size")
	@CheckForNull
	public java.lang.Long l2CacheSize;
	@JsonProperty("refcount-cache-size")
	@CheckForNull
	public java.lang.Long refcountCacheSize;

	@Nonnull
	public BlockdevOptionsQcow2 withLazyRefcounts(java.lang.Boolean value) {
		this.lazyRefcounts = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withPassDiscardRequest(java.lang.Boolean value) {
		this.passDiscardRequest = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withPassDiscardSnapshot(java.lang.Boolean value) {
		this.passDiscardSnapshot = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withPassDiscardOther(java.lang.Boolean value) {
		this.passDiscardOther = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withOverlapCheck(Qcow2OverlapChecks value) {
		this.overlapCheck = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withCacheSize(java.lang.Long value) {
		this.cacheSize = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withL2CacheSize(java.lang.Long value) {
		this.l2CacheSize = value;
		return this;
	}

	@Nonnull
	public BlockdevOptionsQcow2 withRefcountCacheSize(java.lang.Long value) {
		this.refcountCacheSize = value;
		return this;
	}

	public BlockdevOptionsQcow2() {
	}

	public BlockdevOptionsQcow2(java.lang.Boolean lazyRefcounts, java.lang.Boolean passDiscardRequest, java.lang.Boolean passDiscardSnapshot, java.lang.Boolean passDiscardOther, Qcow2OverlapChecks overlapCheck, java.lang.Long cacheSize, java.lang.Long l2CacheSize, java.lang.Long refcountCacheSize) {
		this.lazyRefcounts = lazyRefcounts;
		this.passDiscardRequest = passDiscardRequest;
		this.passDiscardSnapshot = passDiscardSnapshot;
		this.passDiscardOther = passDiscardOther;
		this.overlapCheck = overlapCheck;
		this.cacheSize = cacheSize;
		this.l2CacheSize = l2CacheSize;
		this.refcountCacheSize = refcountCacheSize;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("lazy-refcounts");
		names.add("pass-discard-request");
		names.add("pass-discard-snapshot");
		names.add("pass-discard-other");
		names.add("overlap-check");
		names.add("cache-size");
		names.add("l2-cache-size");
		names.add("refcount-cache-size");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("lazy-refcounts".equals(name))
			return lazyRefcounts;
		if ("pass-discard-request".equals(name))
			return passDiscardRequest;
		if ("pass-discard-snapshot".equals(name))
			return passDiscardSnapshot;
		if ("pass-discard-other".equals(name))
			return passDiscardOther;
		if ("overlap-check".equals(name))
			return overlapCheck;
		if ("cache-size".equals(name))
			return cacheSize;
		if ("l2-cache-size".equals(name))
			return l2CacheSize;
		if ("refcount-cache-size".equals(name))
			return refcountCacheSize;
		return super.getFieldByName(name);
	}
}
