package com.api.consultaendereco.dataprovider.gateway.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsultaResponse {

	@JsonProperty("cep")
	private String sCep;
	@JsonProperty("logradouro")
	private String sLogradouro;
	@JsonProperty("complemento")
	private String sComplemento;
	@JsonProperty("bairro")
	private String sBairro;
	@JsonProperty("localidade")
	private String sLocalidade;
	@JsonProperty("uf")
	private String sUf;
	@JsonProperty("ibge")
	private String sIbge;
	@JsonProperty("gia")
	private String sGia;
	@JsonProperty("ddd")
	private String sDdd;
	@JsonProperty("siafi")
	private String sSiafi;
	@JsonProperty("erro")
	private Boolean bErro = false;
	
	public String getCep() {
		return sCep;
	}
	public void setCep(String sCep) {
		this.sCep = sCep;
	}
	public String getLogradouro() {
		return sLogradouro;
	}
	public void setLogradouro(String sLogradouro) {
		this.sLogradouro = sLogradouro;
	}
	public String getComplemento() {
		return sComplemento;
	}
	public void setComplemento(String sComplemento) {
		this.sComplemento = sComplemento;
	}
	public String getBairro() {
		return sBairro;
	}
	public void setBairro(String sBairro) {
		this.sBairro = sBairro;
	}
	public String getLocalidade() {
		return sLocalidade;
	}
	public void setLocalidade(String sLocalidade) {
		this.sLocalidade = sLocalidade;
	}
	public String getUf() {
		return sUf;
	}
	public void setUf(String sUf) {
		this.sUf = sUf;
	}
	public String getIbge() {
		return sIbge;
	}
	public void setIbge(String sIbge) {
		this.sIbge = sIbge;
	}
	public String getGia() {
		return sGia;
	}
	public void setGia(String sGia) {
		this.sGia = sGia;
	}
	public String getDdd() {
		return sDdd;
	}
	public void setDdd(String sDdd) {
		this.sDdd = sDdd;
	}
	public String getSiafi() {
		return sSiafi;
	}
	public void setSiafi(String sSiafi) {
		this.sSiafi = sSiafi;
	}
	public Boolean getErro() {
		return bErro;
	}
	
	public void setbErro(Boolean bErro) {
		this.bErro = bErro;
	}
	public void setSiafi(Boolean bErro) {
		this.bErro = bErro;
	}
	
}
