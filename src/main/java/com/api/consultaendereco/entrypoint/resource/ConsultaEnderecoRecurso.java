package com.api.consultaendereco.entrypoint.resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.consultaendereco.core.ConsultaEnderecoUseCase;
import com.api.consultaendereco.entrypoint.resource.request.CepRequest;
import com.api.consultaendereco.entrypoint.resource.response.ConsultaEnderecoResponse;

@RestController
public class ConsultaEnderecoRecurso {

	@Autowired
	ConsultaEnderecoUseCase useCase;
	
	@RequestMapping(value = "/consulta-endereco", method = RequestMethod.POST)
	public ConsultaEnderecoResponse conulta(@Valid @RequestBody CepRequest cep) {
		
		return useCase.consultar(cep);
	}	
}
