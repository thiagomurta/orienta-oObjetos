public class ContaEnergia
{
    private int quilowattsConsumidos;
    
    public void setQuilowattsConsumidos(int quilowattsConsumidos){
        this.quilowattsConsumidos = quilowattsConsumidos;
    }
    
    public int getQuilowattsConsumidos(){
        return this.quilowattsConsumidos;
    }
    
    public float valorPagar(){
        float valor = this.quilowattsConsumidos * 0.12f;
        float ICMS = 0.18f * valor;
        valor = valor + ICMS;
        return valor;
    }
}
