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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class ConsultaEnderecoRecurso {

	@Autowired
	ConsultaEnderecoUseCase useCase;
	
	@Operation(description = "Faz a consulta do região via CEP e calcula o frete de envio.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Retorna a descrição da região com valor de frete."),
			@ApiResponse(responseCode = "200", description = "Retorna uma mensagem informativa caso o CEP não exista.")
	})
	@RequestMapping(value = "/consulta-endereco", method = RequestMethod.POST)
	public ConsultaEnderecoResponse conulta(@Valid @RequestBody CepRequest cep) {
		
		return useCase.consultar(cep);
	}	
}
