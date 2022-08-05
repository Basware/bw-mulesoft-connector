package com.mulesoft.connectors.baswareconnectormule4.api.proxy;

import java.util.Objects;
import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.dsl.xml.TypeDsl;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.http.api.client.proxy.ProxyConfig;
import org.mule.sdk.api.annotation.semantics.connectivity.ConfiguresProxy;
import org.mule.sdk.api.annotation.semantics.connectivity.Host;
import org.mule.sdk.api.annotation.semantics.connectivity.Port;
import org.mule.sdk.api.annotation.semantics.security.Password;
import org.mule.sdk.api.annotation.semantics.security.Username;

@Alias("proxy")
@TypeDsl(allowTopLevelDefinition = true)
@ConfiguresProxy
public class HttpProxyConfig implements ProxyConfig {
  /** Host where the proxy requests will be sent. */
  @Parameter
  @Expression(ExpressionSupport.NOT_SUPPORTED)
  @Host
  private String host;

  /** Port where the proxy requests will be sent. */
  @Parameter
  @Expression(ExpressionSupport.NOT_SUPPORTED)
  @Port
  private int port = Integer.MAX_VALUE;

  /** The username to authenticate against the proxy. */
  @Parameter
  @Expression(ExpressionSupport.NOT_SUPPORTED)
  @Username
  private String username;

  /** The password to authenticate against the proxy. */
  @Parameter
  @Expression(ExpressionSupport.NOT_SUPPORTED)
  @Password
  private String password;

  /** A list of comma separated hosts against which the proxy should not be used */
  @Parameter
  @Expression(ExpressionSupport.NOT_SUPPORTED)
  private String nonProxyHosts;

  @Override
  public String getHost() {
    return this.host;
  }

  @Override
  public int getPort() {
    return this.port;
  }

  @Override
  public String getUsername() {
    return this.username;
  }

  @Override
  public String getPassword() {
    return this.password;
  }

  @Override
  public String getNonProxyHosts() {
    return this.nonProxyHosts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpProxyConfig that = (HttpProxyConfig) o;
    return port == that.port
        && Objects.equals(host, that.host)
        && Objects.equals(username, that.username)
        && Objects.equals(password, that.password)
        && Objects.equals(nonProxyHosts, that.nonProxyHosts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, username, password, nonProxyHosts);
  }
}
