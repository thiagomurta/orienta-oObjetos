public class AlunoEnsinoMedio extends Aluno
{    
    public AlunoEnsinoMedio(){}
    
    public String resultadoAlunoEnsinoMedio(){
        float media = this.calculaMediaAluno();
        if(media >= 6.0){
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
