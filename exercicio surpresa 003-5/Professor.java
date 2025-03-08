public class Professor extends Pessoa
{
    private String titulacao;
    
    public Professor(){}
    
    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
    
    public String getTitulacao(){
        return this.titulacao;
    }
}
