import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoGraduacaoTest
{
    @Test
    public void testeDeveRetornarReprovado(){
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNome("Thiago");
        aluno.setMatricula("202165570C");
        aluno.setNota1(6.9f);
        aluno.setNota2(6.9f);
        aluno.setNota3(6.9f);
        aluno.setNota4(6.9f);
        assertEquals("Reprovado", aluno.resultadoAlunoGraduacao());
    }
    
    @Test
    public void testeDeveRetornarAprovado(){
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNome("Thiago");
        aluno.setMatricula("202165570C");
        aluno.setNota1(7.0f);
        aluno.setNota2(7.0f);
        aluno.setNota3(7.0f);
        aluno.setNota4(7.0f);
        assertEquals("Aprovado", aluno.resultadoAlunoGraduacao());
    }
    
    @Test
    public void testeDeveRetornarMatricula(){
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setMatricula("202165570C");
        assertEquals("202165570C", aluno.getMatricula());
    }
    
    @Test
    public void testeDeveRetornarNome(){
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNome("Thiago");
        assertEquals("Thiago", aluno.getNome());
    }
}
