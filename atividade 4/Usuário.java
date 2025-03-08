public class Usuário
{
    private float quilometros;
    private float combustivelGasto;
    
    public void setQuilometros(float quilometros){
        this.quilometros = quilometros;
    }
    
    public void setCombustivelGasto(float combustivelGasto){
        this.combustivelGasto = combustivelGasto;
    }
    
    public float mediaGasta(){
        return this.quilometros/this.combustivelGasto;
    }
}
