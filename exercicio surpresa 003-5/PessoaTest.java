import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest
{
    @Test
    public void testeDeveRetornarThiago(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Thiago");
        assertEquals("Thiago", pessoa.getNome());
    }
}
