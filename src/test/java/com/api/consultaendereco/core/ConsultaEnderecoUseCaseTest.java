package com.api.consultaendereco.core;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.api.consultaendereco.dataprovider.gateway.ConsultaEnderecoGateway;
import com.api.consultaendereco.dataprovider.gateway.response.ConsultaResponse;
import com.api.consultaendereco.entrypoint.resource.request.CepRequest;
import com.api.consultaendereco.entrypoint.resource.response.ConsultaEnderecoResponse;

public class ConsultaEnderecoUseCaseTest {
    
    private ConsultaEnderecoUseCase useCase;
    private ConsultaEnderecoGateway gateway;
    private static String CEP_VALIDO = "01001000";
    private static String CEP_INVALIDO = "00000000";
    
    @BeforeEach
    public void setup() {
        gateway = mock(ConsultaEnderecoGateway.class);
        useCase = new ConsultaEnderecoUseCase();
        useCase.gateway = gateway;
    }
    
    @Test
    public void test_Consultar_Sucesso() {
    	
        CepRequest requestCep = new CepRequest(CEP_VALIDO);
        ConsultaResponse gatewayResponse = new ConsultaResponse();
        gatewayResponse.setCep(CEP_VALIDO);
        gatewayResponse.setLocalidade("São Paulo");
        gatewayResponse.setUf("SP");
        when(gateway.consulta("01001000")).thenReturn(gatewayResponse);
        
        ConsultaEnderecoResponse response = useCase.consultar(requestCep);
        
        Assertions.assertNotNull(response);
        Assertions.assertEquals(CEP_VALIDO, response.getCep());
        Assertions.assertEquals("São Paulo", response.getCidade());
        Assertions.assertEquals("SP", response.getEstado());
    }
    
    @Test
    public void test_Consultar_Cep_Não_Existe() {
        
        CepRequest requestCep = new CepRequest(CEP_INVALIDO);
        
        ConsultaResponse gatewayResponse = new ConsultaResponse();
        gatewayResponse.setbErro(true);
        when(gateway.consulta("00000000")).thenReturn(gatewayResponse);
        
        ConsultaEnderecoResponse response = useCase.consultar(requestCep);
        
        Assertions.assertEquals("CEP não encontrado. Tente novamente.", response.getsAlerta());
    }
}
