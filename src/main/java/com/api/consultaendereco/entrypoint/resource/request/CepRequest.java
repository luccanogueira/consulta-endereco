package com.api.consultaendereco.entrypoint.resource.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CepRequest {
	
	@JsonProperty("cep")
	@NotNull(message = "O campo cep é obrigatório.")
	private String sCep;

	public CepRequest() {
	}

	public CepRequest(@NotNull(message = "O campo cep é obrigatório.") String sCep) {
		super();
		this.sCep = sCep;
	}

	public String getsCep() {
		return sCep;
	}

	public void setsCep(String sCep) {
		this.sCep = sCep;
	}
	
}
