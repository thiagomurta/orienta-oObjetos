import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTest
{
    @Test
    public void testeDeveRetornarValor(){
        Funcionario funcionario = new Funcionario();
        //Funcionario funcionario = new Funcionario("Thiago", 0.1f, 0.0f, 0.0f);
        funcionario.setNome("Thiago");
        funcionario.setSalarioBruto(0.1f);
        funcionario.setTotalAcrescimos(0.0f);
        funcionario.setTotalDescontos(0.0f);
        assertEquals("O salario nao e nagativo!", funcionario.recebeSalario());
    }
    
    @Test
    public void testeNaoDeveRetornarValor(){
        Funcionario funcionario = new Funcionario();
        //Funcionario funcionario = new Funcionario("Thiago", 0.1f, 0.0f, 0.2f);
        funcionario.setNome("Thiago");
        funcionario.setSalarioBruto(0.1f);
        funcionario.setTotalAcrescimos(0.0f);
        funcionario.setTotalDescontos(0.2f);
        assertEquals("O salario e negativo!", funcionario.recebeSalario());
    }
}