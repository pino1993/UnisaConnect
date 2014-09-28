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
 * Model definition for BusChangeLog.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the bustrattaendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BusChangeLog extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long data;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BusTratta tratta;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userID;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getData() {
    return data;
  }

  /**
   * @param data data or {@code null} for none
   */
  public BusChangeLog setData(java.lang.Long data) {
    this.data = data;
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
  public BusChangeLog setId(Key id) {
    this.id = id;
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
  public BusChangeLog setTratta(BusTratta tratta) {
    this.tratta = tratta;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUserID() {
    return userID;
  }

  /**
   * @param userID userID or {@code null} for none
   */
  public BusChangeLog setUserID(java.lang.String userID) {
    this.userID = userID;
    return this;
  }

  @Override
  public BusChangeLog set(String fieldName, Object value) {
    return (BusChangeLog) super.set(fieldName, value);
  }

  @Override
  public BusChangeLog clone() {
    return (BusChangeLog) super.clone();
  }

}
