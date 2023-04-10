package com.api.consultaendereco.entrypoint.resource.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultaEnderecoResponse {

	@JsonProperty("cep")
	private String sCep;
	@JsonProperty("rua")
	private String sRua;
	@JsonProperty("complemento")
	private String sComplemento;
	@JsonProperty("bairro")
	private String sBairro;
	@JsonProperty("cidade")
	private String sCidade;
	@JsonProperty("estado")
	private String sEstado;
	@JsonProperty("frete")
	private Double bFrete;
	@JsonProperty("alerta")
	private String sAlerta;

	public ConsultaEnderecoResponse(String sAlerta) {
		this.sAlerta = sAlerta;
	}

	public ConsultaEnderecoResponse(String sCep, String sRua, String sComplemento, String sBairro, String sCidade,
			String sEstado, Double bFrete) {
		this.sCep = sCep;
		this.sRua = sRua;
		this.sComplemento = sComplemento;
		this.sBairro = sBairro;
		this.sCidade = sCidade;
		this.sEstado = sEstado;
		this.bFrete = bFrete;
	}

	public String getCep() {
		return sCep;
	}
	public void setCep(String sCep) {
		this.sCep = sCep;
	}
	public String getRua() {
		return sRua;
	}
	public void setRua(String sRua) {
		this.sRua = sRua;
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
	public String getCidade() {
		return sCidade;
	}
	public void setCidade(String sCidade) {
		this.sCidade = sCidade;
	}
	public String getEstado() {
		return sEstado;
	}
	public void setEstado(String sEstado) {
		this.sEstado = sEstado;
	}
	public Double getFrete() {
		return bFrete;
	}
	public void setFrete(Double bFrete) {
		this.bFrete = bFrete;
	}

}
