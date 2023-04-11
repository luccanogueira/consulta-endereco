package com.api.consultaendereco.entrypoint.resource.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CepRequest {
	
	@JsonProperty("cep")
	@NotNull(message = "O campo cep é obrigatório.")
	private String sCep;

	public String getsCep() {
		return sCep;
	}

	public void setsCep(String sCep) {
		this.sCep = sCep;
	}
	
	public static final class Builder {
		
		private String sCep;
		
		public Builder cep(final String cep) {
			this.sCep = cep;
			return this;
		}
		
		public CepRequest build() {
			
			CepRequest request = new CepRequest();
			request.setsCep(sCep);
			
			return request;
		}
	}
}