import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest
{
    private Pessoa pessoa;
    
    @BeforeEach
    public void setUp(){
        pessoa = new Pessoa();
    }
    
    ///Sexo
    @Test
    public void deveRetornarExcecaoSexoInvalido(){
        try{
            pessoa.setSexo("A");
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Sexo Invalido!", e.getMessage());
        }
    }
    
    @Test
    public void deveRetornarMasculino(){
        pessoa.setSexo("M");
        assertEquals("M", pessoa.getSexo());
    }
    
    @Test
    public void deveRetornarFeminino(){
        pessoa.setSexo("F");
        assertEquals("F", pessoa.getSexo());
    }
    
    ///Masculino
    @Test
    public void testeDeveRetornarMasculinoAbaixoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        assertEquals("Abaixo do peso!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarMasculinoPesoNormal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        assertEquals("Peso normal!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarMasculinoMarginalmenteAcimaPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        assertEquals("Marginalmente acima do peso!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarMasculinoAcimaPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        assertEquals("Acima do peso ideal!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarMasculinoObeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.1f);
        assertEquals( "Obeso!", pessoa.condicaoIMC());
    }
    
    ///Feminino
    @Test
    public void testeDeveRetornarFemininoAbaixoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        assertEquals("Abaixo do peso!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarFemininooPesoNormal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        assertEquals("Peso normal!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarFemininoMarginalmenteAcimaPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        assertEquals("Marginalmente acima do peso!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarFemininoAcimaPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        assertEquals("Acima do peso ideal!", pessoa.condicaoIMC());
    }
    
    @Test
    public void testeDeveRetornarFemininoObeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.4f);
        assertEquals( "Obeso!", pessoa.condicaoIMC());
    }
}
