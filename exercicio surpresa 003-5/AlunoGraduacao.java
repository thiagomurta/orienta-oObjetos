public class AlunoGraduacao extends Aluno
{
    public String resultadoAlunoGraduacao(){
        float media = this.calculaMediaAluno();
        if(media >= 7.0){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
    
    public String getMatricula(){
        return this.matricula;
    }
}
