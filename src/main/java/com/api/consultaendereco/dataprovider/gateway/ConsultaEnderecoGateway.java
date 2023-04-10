package com.api.consultaendereco.dataprovider.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.consultaendereco.client.ConsultaEnderecoClient;
import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;

@Component
public class ConsultaEnderecoGateway {

	@Autowired
	private ConsultaEnderecoClient client;
	
	public ConsultaResponse consulta(String cep) {
		return client.execute(cep);
	}
}
