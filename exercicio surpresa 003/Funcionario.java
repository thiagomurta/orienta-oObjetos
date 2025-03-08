public class Funcionario
{
    private String nome;
    private float salarioBruto;
    private float totalAcrescimos;
    private float totalDescontos;
    
    public Funcionario(String nome, float salarioBruto, float totalAcrescimos, float totalDescontos){
        this.setNome(nome);
        this.setSalarioBruto(salarioBruto);
        this.setTotalAcrescimos(totalAcrescimos);
        this.setTotalDescontos(totalDescontos);
    }
    
    public Funcionario(){
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalarioBruto(float salarioBruto){
        this.salarioBruto = salarioBruto;
    }
    
    public void setTotalAcrescimos(float totalAcrescimos){
        this.totalAcrescimos = totalAcrescimos;
    }
    
    public void setTotalDescontos(float totalDescontos){
        this.totalDescontos = totalDescontos;
    }
    
    public float calculaSalarioLiquido(){
        return (this.salarioBruto + this.totalAcrescimos) - this.totalDescontos;
    }
    
    public String recebeSalario(){
        float salario = calculaSalarioLiquido();
        String situacao;
        if(salario < 0){
            situacao = "O salario e negativo!";
        }
        else{
            situacao = "O salario nao e nagativo!";
        }
        return situacao;
    }
}
