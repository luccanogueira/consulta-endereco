package com.api.consultaendereco.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.api.consultaendereco.dataprovider.gateway.ConsultaEnderecoGateway;
import com.api.consultaendereco.dataprovider.gateway.mapper.ResponseMapper;
import com.api.consultaendereco.entrypoint.resource.request.CepRequest;
import com.api.consultaendereco.entrypoint.resource.response.ConsultaEnderecoResponse;

@Component
public class ConsultaEnderecoUseCase {

	@Autowired
<<<<<<< HEAD
	ConsultaEnderecoGateway gateway;
=======
	public ConsultaEnderecoGateway gateway;
>>>>>>> b7cff56f2d0a9082e6a1ed5131973527e687096f
	
	 public ConsultaEnderecoResponse consultar(CepRequest cep) {
		 
		 ConsultaEnderecoResponse response = ResponseMapper.mapperResponse(gateway.consulta(format(cep.getsCep())));
		 
		 return response;
	 }
	 
	 private String format(String cep) {
		 cep = cep.replace(".", "");
		 cep = cep.replace("-", "");
		 cep = cep.replace(" ", "");
		 
		 return cep;
	 }
}
