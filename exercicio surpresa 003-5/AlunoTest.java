
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest
{
    @Test
    public void testeDeveRetornarMenor6(){
        Aluno aluno = new Aluno();
        aluno.setNota1(5.9f);
        aluno.setNota2(5.9f);
        aluno.setNota3(5.9f);
        aluno.setNota4(5.9f);
        assertEquals(5.9f, aluno.calculaMediaAluno());
    }
    
    @Test
    public void testeDeveRetornarIgual6(){
        Aluno aluno = new Aluno();
        aluno.setNota1(6.0f);
        aluno.setNota2(6.0f);
        aluno.setNota3(6.0f);
        aluno.setNota4(6.0f);
        assertEquals(6.0f, aluno.calculaMediaAluno());
    }
}
