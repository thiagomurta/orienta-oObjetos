public class Funcionário
{
    private float salario;
    private float horasExtras;
    private float valorHoraExtra;
    private int QuantHoras;
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public float calcularNovoSalario(){
        this.salario = this.salario + (this.QuantHoras * this.valorHoraExtra);
        float inss = this.salario * 0.8f;
        this.salario = this.salario - inss;
        return this.salario;
    }
    
    public void setValHorEx(float valorHoraExtra){
        this.valorHoraExtra = valorHoraExtra;
    }
    
    public void setQuantHoras(int QuantHoras){
        this.QuantHoras = QuantHoras;
    }
    
    public float getValHorEx(float valorHoraExtra){
        return valorHoraExtra;
    }
    
    public int getQuantHoras(int QuantHoras){
        return QuantHoras;
    }
}