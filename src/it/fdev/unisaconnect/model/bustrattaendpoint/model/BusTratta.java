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
 * Model definition for BusTratta.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the bustrattaendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BusTratta extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BusChangeLog> cambiamenti;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String capolinea;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compagnia;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BusCorsa> corse;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key key;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> stazioniDaUni;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> stazioniVersoUni;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> votantiNegativi;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> votantiPositivi;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer votiNegativi;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer votiPositivi;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<BusChangeLog> getCambiamenti() {
    return cambiamenti;
  }

  /**
   * @param cambiamenti cambiamenti or {@code null} for none
   */
  public BusTratta setCambiamenti(java.util.List<BusChangeLog> cambiamenti) {
    this.cambiamenti = cambiamenti;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCapolinea() {
    return capolinea;
  }

  /**
   * @param capolinea capolinea or {@code null} for none
   */
  public BusTratta setCapolinea(java.lang.String capolinea) {
    this.capolinea = capolinea;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCompagnia() {
    return compagnia;
  }

  /**
   * @param compagnia compagnia or {@code null} for none
   */
  public BusTratta setCompagnia(java.lang.String compagnia) {
    this.compagnia = compagnia;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<BusCorsa> getCorse() {
    return corse;
  }

  /**
   * @param corse corse or {@code null} for none
   */
  public BusTratta setCorse(java.util.List<BusCorsa> corse) {
    this.corse = corse;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public BusTratta setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Key getKey() {
    return key;
  }

  /**
   * @param key key or {@code null} for none
   */
  public BusTratta setKey(Key key) {
    this.key = key;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStazioniDaUni() {
    return stazioniDaUni;
  }

  /**
   * @param stazioniDaUni stazioniDaUni or {@code null} for none
   */
  public BusTratta setStazioniDaUni(java.util.List<java.lang.String> stazioniDaUni) {
    this.stazioniDaUni = stazioniDaUni;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStazioniVersoUni() {
    return stazioniVersoUni;
  }

  /**
   * @param stazioniVersoUni stazioniVersoUni or {@code null} for none
   */
  public BusTratta setStazioniVersoUni(java.util.List<java.lang.String> stazioniVersoUni) {
    this.stazioniVersoUni = stazioniVersoUni;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVotantiNegativi() {
    return votantiNegativi;
  }

  /**
   * @param votantiNegativi votantiNegativi or {@code null} for none
   */
  public BusTratta setVotantiNegativi(java.util.List<java.lang.String> votantiNegativi) {
    this.votantiNegativi = votantiNegativi;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getVotantiPositivi() {
    return votantiPositivi;
  }

  /**
   * @param votantiPositivi votantiPositivi or {@code null} for none
   */
  public BusTratta setVotantiPositivi(java.util.List<java.lang.String> votantiPositivi) {
    this.votantiPositivi = votantiPositivi;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVotiNegativi() {
    return votiNegativi;
  }

  /**
   * @param votiNegativi votiNegativi or {@code null} for none
   */
  public BusTratta setVotiNegativi(java.lang.Integer votiNegativi) {
    this.votiNegativi = votiNegativi;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVotiPositivi() {
    return votiPositivi;
  }

  /**
   * @param votiPositivi votiPositivi or {@code null} for none
   */
  public BusTratta setVotiPositivi(java.lang.Integer votiPositivi) {
    this.votiPositivi = votiPositivi;
    return this;
  }

  @Override
  public BusTratta set(String fieldName, Object value) {
    return (BusTratta) super.set(fieldName, value);
  }

  @Override
  public BusTratta clone() {
    return (BusTratta) super.clone();
  }

}
