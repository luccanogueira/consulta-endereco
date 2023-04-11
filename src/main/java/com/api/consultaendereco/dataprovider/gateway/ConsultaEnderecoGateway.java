package com.api.consultaendereco.dataprovider.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.consultaendereco.client.ConsultaEnderecoClient;
import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;

@Component
public class ConsultaEnderecoGateway {

	@Autowired
<<<<<<< HEAD
	ConsultaEnderecoClient client;
=======
	public ConsultaEnderecoClient client;
>>>>>>> b7cff56f2d0a9082e6a1ed5131973527e687096f
	
	public ConsultaResponse consulta(String cep) {
		return client.execute(cep);
	}
}
