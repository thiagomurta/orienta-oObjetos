public class Funcionário
{
    private float salario;
    private float percAumento;
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public void setPercAumento(float percAumento){
        this.percAumento = percAumento;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public float calcularAumento(){
        float aumento;
        aumento = this.salario * (this.percAumento/100);
        return aumento;
    }
    
    public float calcularNovoSalario(){
        this.salario = this.salario + (this.salario * (this.percAumento/100));
        return this.salario;
    }
}

