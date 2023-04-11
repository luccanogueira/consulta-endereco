package com.api.consultaendereco.client;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;

public class ConsultaEnderecoClientTest {
    
    private final ConsultaEnderecoClient client = new ConsultaEnderecoClient();
    
    @Test
    public void test_Execute_Sucesso() {
    	
        String cep = "01001000";
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + cep + "/json";
        
        ConsultaResponse response = restTemplate.getForEntity(url, ConsultaResponse.class).getBody();
        
        Assertions.assertNotNull(response);
        Assertions.assertEquals("01001-000", response.getCep());
        Assertions.assertEquals("São Paulo", response.getLocalidade());
        Assertions.assertEquals("SP", response.getUf());
    }
    
    @Test
    public void test_Execute_Cep_Nao_Existe() {
    	
        String cep = "00000000";
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://viacep.com.br/ws/" + cep + "/json";
        
        ConsultaResponse response = restTemplate.getForEntity(url, ConsultaResponse.class).getBody();
        
        Assertions.assertEquals(true, response.getErro());
    }
}

