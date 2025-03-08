import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoEnsinoMedioTest
{
    @Test
    public void testeDeveRetornarReprovado(){
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNome("Thiago");
        aluno.setMatricula("202165570C");
        aluno.setNota1(5.9f);
        aluno.setNota2(5.9f);
        aluno.setNota3(5.9f);
        aluno.setNota4(5.9f);
        assertEquals("Reprovado", aluno.resultadoAlunoEnsinoMedio());
    }
    
    @Test
    public void testeDeveRetornarAprovado(){
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNome("Thiago");
        aluno.setMatricula("202165570C");
        aluno.setNota1(6.0f);
        aluno.setNota2(6.0f);
        aluno.setNota3(6.0f);
        aluno.setNota4(6.0f);
        assertEquals("Aprovado", aluno.resultadoAlunoEnsinoMedio());
    }
    
    @Test
    public void testeDeveRetornarMatricula(){
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setMatricula("202165570C");
        assertEquals("202165570C", aluno.getMatricula());
    }
    
    @Test
    public void testeDeveRetornarNome(){
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.setNome("Thiago");
        assertEquals("Thiago", aluno.getNome());
    }
}
