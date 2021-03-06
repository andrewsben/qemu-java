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
 * <p><pre>QApiTypeDescriptor{name=ChardevSocket, data={addr=SocketAddress, *server=bool, *wait=bool, *nodelay=bool, *telnet=bool}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=ChardevSocket, data={addr=SocketAddress, *server=bool, *wait=bool, *nodelay=bool, *telnet=bool}, innerTypes=null}
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChardevSocket extends QApiType {

	@JsonProperty("addr")
	@Nonnull
	public SocketAddress addr;
	@JsonProperty("server")
	@CheckForNull
	public java.lang.Boolean server;
	@JsonProperty("wait")
	@CheckForNull
	public java.lang.Boolean wait;
	@JsonProperty("nodelay")
	@CheckForNull
	public java.lang.Boolean nodelay;
	@JsonProperty("telnet")
	@CheckForNull
	public java.lang.Boolean telnet;

	@Nonnull
	public ChardevSocket withAddr(SocketAddress value) {
		this.addr = value;
		return this;
	}

	@Nonnull
	public ChardevSocket withServer(java.lang.Boolean value) {
		this.server = value;
		return this;
	}

	@Nonnull
	public ChardevSocket withWait(java.lang.Boolean value) {
		this.wait = value;
		return this;
	}

	@Nonnull
	public ChardevSocket withNodelay(java.lang.Boolean value) {
		this.nodelay = value;
		return this;
	}

	@Nonnull
	public ChardevSocket withTelnet(java.lang.Boolean value) {
		this.telnet = value;
		return this;
	}

	public ChardevSocket() {
	}

	public ChardevSocket(SocketAddress addr, java.lang.Boolean server, java.lang.Boolean wait, java.lang.Boolean nodelay, java.lang.Boolean telnet) {
		this.addr = addr;
		this.server = server;
		this.wait = wait;
		this.nodelay = nodelay;
		this.telnet = telnet;
	}

	@JsonIgnore
	@Override
	public java.util.List<java.lang.String> getFieldNames() {
		java.util.List<java.lang.String> names = super.getFieldNames();
		names.add("addr");
		names.add("server");
		names.add("wait");
		names.add("nodelay");
		names.add("telnet");
		return names;
	}

	@Override
	public Object getFieldByName(@Nonnull java.lang.String name) throws NoSuchFieldException {
		if ("addr".equals(name))
			return addr;
		if ("server".equals(name))
			return server;
		if ("wait".equals(name))
			return wait;
		if ("nodelay".equals(name))
			return nodelay;
		if ("telnet".equals(name))
			return telnet;
		return super.getFieldByName(name);
	}
}
