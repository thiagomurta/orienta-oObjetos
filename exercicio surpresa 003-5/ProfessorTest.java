import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfessorTest
{
    @Test
    public void testeDeveRetornarDoutor(){
        Professor prof = new Professor();
        prof.setNome("Thiago");
        prof.setTitulacao("Doutor");
        assertEquals("Doutor", prof.getTitulacao());
    }
}
