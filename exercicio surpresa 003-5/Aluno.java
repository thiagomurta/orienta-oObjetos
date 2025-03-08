public class Aluno extends Pessoa
{
    protected String matricula;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    
    public Aluno(){}
    
    public void setNota1(float nota1){
        this.nota1 = nota1;
    }
    
    public void setNota2(float nota2){
        this.nota2 = nota2;
    }
    
    public void setNota3(float nota3){
        this.nota3 = nota3;
    }
    
    public void setNota4(float nota4){
        this.nota4 = nota4;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public float calculaMediaAluno(){
        float soma = this.nota1 + this.nota2 + this.nota3 + this.nota4;
        return soma/4;
    }
}
