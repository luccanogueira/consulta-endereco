package com.api.consultaendereco.dataprovider.gateway.mapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;
import com.api.consultaendereco.entrypoint.resource.response.ConsultaEnderecoResponse;

class ResponseMapperTest {

    @Test
    void Retornar_Alerta_Consulta_Quando_CEP_nao_Existe() {
     
        ConsultaResponse consultaResponse = new ConsultaResponse();
        consultaResponse.setbErro(true);

        ConsultaEnderecoResponse enderecoResponse = ResponseMapper.mapperResponse(consultaResponse);

        Assertions.assertEquals("CEP não encontrado. Tente novamente.", enderecoResponse.getsAlerta());
    }

    @Test
    void Retorna_Consulta_Com_Regiao_Sudeste() {
     
        ConsultaResponse consultaResponse = new ConsultaResponse();
        consultaResponse.setCep("12345678");
        consultaResponse.setLogradouro("Rua Teste");
        consultaResponse.setBairro("Bairro Teste");
        consultaResponse.setLocalidade("Cidade Teste");
        consultaResponse.setUf("SP");

        ConsultaEnderecoResponse enderecoResponse = ResponseMapper.mapperResponse(consultaResponse);

        Assertions.assertEquals(7.85, enderecoResponse.getFrete());
    }

    @Test
    void Retorna_Consulta_Com_Regiao_Centro_Oeste() {
        
        ConsultaResponse consultaResponse = new ConsultaResponse();
        consultaResponse.setCep("12345678");
        consultaResponse.setLogradouro("Rua Teste");
        consultaResponse.setBairro("Bairro Teste");
        consultaResponse.setLocalidade("Cidade Teste");
        consultaResponse.setUf("GO");

        ConsultaEnderecoResponse enderecoResponse = ResponseMapper.mapperResponse(consultaResponse);

        Assertions.assertEquals(12.50, enderecoResponse.getFrete());
    }

    @Test
    void Retorna_Consulta__Com_Regiao_Nordeste() {
       
        ConsultaResponse consultaResponse = new ConsultaResponse();
        consultaResponse.setCep("12345678");
        consultaResponse.setLogradouro("Rua Teste");
        consultaResponse.setBairro("Bairro Teste");
        consultaResponse.setLocalidade("Cidade Teste");
        consultaResponse.setUf("PE");

        ConsultaEnderecoResponse enderecoResponse = ResponseMapper.mapperResponse(consultaResponse);

        Assertions.assertEquals(15.9, enderecoResponse.getFrete());
    }

    @Test
    void Retorna_Consulta__Com_Regiao_Sul() {
        
        ConsultaResponse consultaResponse = new ConsultaResponse();
        consultaResponse.setCep("12345678");
        consultaResponse.setLogradouro("Rua Teste");
        consultaResponse.setBairro("Bairro Teste");
        consultaResponse.setLocalidade("Cidade Teste");
        consultaResponse.setUf("RS");

        ConsultaEnderecoResponse enderecoResponse = ResponseMapper.mapperResponse(consultaResponse);

        Assertions.assertEquals(17.30, enderecoResponse.getFrete());
    }
}

