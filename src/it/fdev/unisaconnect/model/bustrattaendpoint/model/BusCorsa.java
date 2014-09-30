/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-07-22 21:53:01 UTC)
 * on 2014-07-31 at 20:50:19 UTC 
 * Modify at your own risk.
 */

package it.fdev.unisaconnect.model.bustrattaendpoint.model;

/**
 * Model definition for BusCorsa.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the bustrattaendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BusCorsa extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BusFermata> fermate;

  static {
    // hack to force ProGuard to consider BusFermata used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(BusFermata.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String giorni;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer oraPartenza;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusTratta tratta;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean versoUni;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<BusFermata> getFermate() {
    return fermate;
  }

  /**
   * @param fermate fermate or {@code null} for none
   */
  public BusCorsa setFermate(java.util.List<BusFermata> fermate) {
    this.fermate = fermate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGiorni() {
    return giorni;
  }

  /**
   * @param giorni giorni or {@code null} for none
   */
  public BusCorsa setGiorni(java.lang.String giorni) {
    this.giorni = giorni;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public BusCorsa setId(Key id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOraPartenza() {
    return oraPartenza;
  }

  /**
   * @param oraPartenza oraPartenza or {@code null} for none
   */
  public BusCorsa setOraPartenza(java.lang.Integer oraPartenza) {
    this.oraPartenza = oraPartenza;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public BusTratta getTratta() {
    return tratta;
  }

  /**
   * @param tratta tratta or {@code null} for none
   */
  public BusCorsa setTratta(BusTratta tratta) {
    this.tratta = tratta;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVersoUni() {
    return versoUni;
  }

  /**
   * @param versoUni versoUni or {@code null} for none
   */
  public BusCorsa setVersoUni(java.lang.Boolean versoUni) {
    this.versoUni = versoUni;
    return this;
  }

  @Override
  public BusCorsa set(String fieldName, Object value) {
    return (BusCorsa) super.set(fieldName, value);
  }

  @Override
  public BusCorsa clone() {
    return (BusCorsa) super.clone();
  }

}