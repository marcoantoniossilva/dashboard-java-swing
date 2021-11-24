package br.edu.ifba.dashboard.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Local {

  @JsonProperty("cod_local")
  private Integer codLocal;
  @JsonProperty("cod_bairro")
  private Integer codBairro;
  private String latitude;
  private String longitude;

  public Integer getCodLocal() {
    return codLocal;
  }

  public Local setCodLocal(Integer codLocal) {
    this.codLocal = codLocal;
    return this;
  }

  public Integer getCodBairro() {
    return codBairro;
  }

  public Local setCodBairro(Integer codBairro) {
    this.codBairro = codBairro;
    return this;
  }

  public String getLatitude() {
    return latitude;
  }

  public Local setLatitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  public String getLongitude() {
    return longitude;
  }

  public Local setLongitude(String longitude) {
    this.longitude = longitude;
    return this;
  }
}
