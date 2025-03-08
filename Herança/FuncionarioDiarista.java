public class FuncionarioDiarista extends Funcionario
{
    private float valorDia;
    private int quantidadeDias;
    private float valorHora;
    private int quantidadeHoras;
    
    public void setValorDia(float valorDia){
        this.valorDia = valorDia;
    }
    
    public void setQuantidadeDias(int quantidadeDias){
        this.quantidadeDias = quantidadeDias;
    }
    
    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    
    public void setQuantidadeHoras(int quantidadeHoras){
        this.quantidadeHoras = quantidadeHoras;
    }
    
    public float getValorDia(float valorDia){
        return this.valorDia;
    }
    
    public int getQuantidadeDias(){
        return this.quantidadeDias;
    }
    
    public float getValorHora(){
        return this.valorHora;
    }
    
    public int getQuantidadeHoras(){
        return this.quantidadeHoras;
    }
    
    public float calculaSalario(){
        return (this.quantidadeDias * this.valorDia) + (this.valorHora * this.quantidadeHoras);
    }
    //diarista: val hora, dias
}
