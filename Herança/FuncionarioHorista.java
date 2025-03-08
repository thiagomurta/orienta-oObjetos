public class FuncionarioHorista extends Funcionario
{
    private float valorHora;
    private int quantidadeDias;
    private int quantidadeHoras;
    
    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    
    public void setQuantidadeDias(int quantidadeDias){
        this.quantidadeDias = quantidadeDias;
    }
    
    public void setQuantidadeHoras(int quantidadeHoras){
        this.quantidadeHoras = quantidadeHoras;
    }
    
    public float getValorHora(){
        return this.valorHora;
    }
    
    public int getQuantidadeDias(){
        return this.quantidadeDias;
    }
    
    public int getQuantidadeHoras(){
        return this.quantidadeHoras;
    }
    
    public float calculaSalario(){
        return this.valorHora * this.quantidadeHoras * this.quantidadeDias;
    }
}
