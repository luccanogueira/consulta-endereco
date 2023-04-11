package com.api.consultaendereco.dataprovider.gateway;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.api.consultaendereco.client.ConsultaEnderecoClient;
import com.api.consultaendereco.dataprovider.gateway.ConsultaEnderecoGateway;
import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;

@SpringBootTest
public class ConsultaEnderecoGatewayTest {

    @Mock
    private ConsultaEnderecoClient client;

    @InjectMocks
    private ConsultaEnderecoGateway gateway;

    @Test
    public void test_Consulta_Sucesso() {
        
        String cep = "12345678";
        ConsultaResponse responseFixture = new ConsultaResponse();

        when(client.execute(cep)).thenReturn(responseFixture);
        ConsultaResponse response = gateway.consulta(cep);

        assertEquals(responseFixture, response);
    }

    @Test
    public void test_Consulta_CEP_Invalido() {
        
        String cep = "12345";

        ConsultaResponse response = gateway.consulta(cep);

        assertEquals(null, response);
    }
}
