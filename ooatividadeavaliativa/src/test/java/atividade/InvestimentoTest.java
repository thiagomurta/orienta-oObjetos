package atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoTest {
    Investimento investimento;

    @BeforeEach
    void setUp(){
        investimento = new Investimento();
    }

    @Test
    void testaInvestir(){
        investimento.setSaldo(0.0f);
        investimento.investir(1.0f);
        assertEquals(1.0f, investimento.getSaldo());
    }

    @Test
    void testaSaldoInsuficiente() {
        try {
            investimento.setSaldo(0.0f);
            investimento.resgatar(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não possui saldo!", e.getMessage());
        }
    }

    @Test
    void testaSaldoInsuficienteRetirada() {
        try {
            investimento.setSaldo(0.0f);
            investimento.resgatar(0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não possui saldo!", e.getMessage());
        }
    }

    @Test
    void testaSaldoSuficiente(){
        investimento.setSaldo(101.0f);
        investimento.resgatar(100.0f);
        assertEquals(0.0f, investimento.getSaldo());
    }
}