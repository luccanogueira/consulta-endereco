package com.api.consultaendereco.dataprovider.gateway.mapper;

import java.util.ArrayList;
import java.util.Arrays;

import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;
import com.api.consultaendereco.entrypoint.resource.response.ConsultaEnderecoResponse;

public class ResponseMapper {
	
	private static final ArrayList<String> UF_SUDESTE = new ArrayList<>(Arrays.asList("ES", "MG", "RJ", "SP"));
	private static final ArrayList<String> UF_CENTRO_OESTE = new ArrayList<>(Arrays.asList("DF", "GO", "MT", "MS"));
	private static final ArrayList<String> UF_NORDESTE = new ArrayList<>(Arrays.asList("AL", "BA", "CE", "MA", "PB", "PI", "PE", "RN", "SE"));
	private static final ArrayList<String> UF_SUL = new ArrayList<>(Arrays.asList("PR", "RS", "SC"));
	private static final String ERRO_CONSULTA = "CEP não encontrado. Tente novamente.";

	public static ConsultaEnderecoResponse mapperResponse(ConsultaResponse response) {
	
		if(response.getErro()) {
			return new ConsultaEnderecoResponse(ERRO_CONSULTA);
		}
		 return new ConsultaEnderecoResponse(response.getCep(), response.getLogradouro(), response.getComplemento(),
				 response.getBairro(), response.getLocalidade(), response.getUf(), verificaRegiao(response.getUf()));
	}
	
	private static Double verificaRegiao(String uf) {
		if(UF_SUDESTE.contains(uf)) {
			return 7.85;
		} else if(UF_CENTRO_OESTE.contains(uf)) {
			return 12.50;
		} else if (UF_NORDESTE.contains(uf)) {
			return 15.9;
		} else if (UF_SUL.contains(uf)) {
			return 17.30;
		}else {
			return 20.83;
		}
		
	}
}
