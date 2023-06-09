	package com.api.consultaendereco.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;

@Component
public class ConsultaEnderecoClient {

	public ConsultaResponse execute(final String cep){
		RestTemplate template = new RestTemplate();
		
		String url = "https://viacep.com.br/ws/" + cep + "/json";
		
		try {
			return template.getForEntity(url, ConsultaResponse.class).getBody();
		} catch (Exception e) {
			ConsultaResponse response = new ConsultaResponse();
			response.setbErro(true);
			
			return response;
		}
		
	}
}
