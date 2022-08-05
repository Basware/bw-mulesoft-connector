package com.mulesoft.connectors.baswareconnectormule4.internal.connection.provider.base;

import com.mulesoft.connectivity.rest.commons.api.connection.OptionalTlsParameterGroup;
import com.mulesoft.connectivity.rest.commons.api.connection.TlsParameterGroup;
import com.mulesoft.connectivity.rest.commons.api.connection.oauth.BaseClientCredentialsConnectionProvider;
import com.mulesoft.connectors.baswareconnectormule4.api.proxy.HttpProxyConfig;
import org.mule.runtime.api.meta.ExpressionSupport;
import org.mule.runtime.extension.api.annotation.Expression;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.annotation.param.display.Placement;
import org.mule.runtime.extension.api.annotation.param.display.Summary;
import org.mule.runtime.extension.api.connectivity.NoConnectivityTest;
import org.mule.runtime.http.api.client.proxy.ProxyConfig;

/**
 * This is the first layer of the connection provider generation gap pattern. It contains most of
 * the logic of the connection provider.
 */
public class Oauth2ConnectionProviderBase extends BaseClientCredentialsConnectionProvider
    implements NoConnectivityTest {
  /** @return the base uri of the REST API being consumed */
  @DisplayName("Base Uri")
  @Summary("Parameter base URI, each instance/tenant gets its own")
  @Parameter
  @Optional(defaultValue = "https://api.basware.com")
  protected String baseUri;

  /**
   * {@link OptionalTlsParameterGroup} references to a TLS config element. This will enable HTTPS
   * for this config.
   */
  @ParameterGroup(name = "tls")
  protected OptionalTlsParameterGroup tlsConfig;

  /**
   * Reusable configuration element for outbound connections through a proxy. A proxy element must
   * define a host name and a port attributes, and optionally can define a username and a password.
   */
  @Parameter
  @Optional
  @Expression(ExpressionSupport.NOT_SUPPORTED)
  @Summary("Reusable configuration element for outbound connections through a proxy")
  @Placement(tab = "Proxy")
  protected HttpProxyConfig proxyConfig;

  /** @return the base uri of the REST API being consumed */
  @Override
  public String getBaseUri() {
    return this.baseUri;
  }

  /**
   * {@link TlsParameterGroup} that configures TLS and allows to switch between HTTP and HTTPS
   * protocols.
   *
   * @return an optional {@link TlsParameterGroup}
   */
  @Override
  public java.util.Optional<TlsParameterGroup> getTlsConfig() {
    return java.util.Optional.ofNullable(this.tlsConfig);
  }

  @Override
  public ProxyConfig getProxyConfig() {
    return this.proxyConfig;
  }
}
