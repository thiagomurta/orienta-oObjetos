package atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BolsaValoresTest {
    BolsaValores bolsa;

    @BeforeEach
    void setUp(){
        bolsa = new BolsaValores();
    }

    @Test
    void testaInvestir(){
        bolsa.setSaldo(0.0f);
        bolsa.investir(50.0f);
        assertEquals(0.0f, bolsa.getSaldo());
    }

    @Test
    void testaSaldoInsuficiente(){
        try {
            bolsa.setSaldo(0.0f);
            bolsa.resgatar(0.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Não possui saldo!", e.getMessage());
        }
    }

    @Test
    void testaSaldoInsuficienteRetirada(){
        try {
            bolsa.setSaldo(0.0f);
            bolsa.resgatar(0.1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Não possui saldo!", e.getMessage());
        }
    }

    @Test
    void testaSaldoSuficiente(){
        bolsa.setSaldo(100.0f);
        bolsa.resgatar(50.0f);
        assertEquals(50.0f, bolsa.getSaldo());
    }

}