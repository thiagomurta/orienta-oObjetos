public class Pessoa
{
    private float altura;
    private float peso;
    private String sexo;
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void setSexo(String sexo){
        if(!(sexo.equals("F") || sexo.equals("M"))){
            throw new IllegalArgumentException("Sexo Invalido!");
        }
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    private float calculaIMC(){
        return this.peso/(this.altura * this.altura);
    }
    
    public String condicaoIMC(){
        float IMC = this.calculaIMC();
        String classificacao;
        if(this.sexo.equals("F")){
            if(IMC < 19.1){
                classificacao = "Abaixo do peso!";
            }
            else if(IMC < 25.8){
                classificacao = "Peso normal!";
            }
            else if( IMC < 27.3){
                classificacao = "Marginalmente acima do peso!";
            }
            else if(IMC < 32.3){
                classificacao = "Acima do peso ideal!";
            }
            else{
                classificacao = "Obeso!";
            }
        }
        else{
            if(IMC < 20.7){
                classificacao ="Abaixo do peso!";
            }
            else if(IMC < 26.4){
                classificacao = "Peso normal!";
            }
            else if(IMC < 27.8){
                classificacao = "Marginalmente acima do peso!";
            }
            else if(IMC < 31.1){
                classificacao = "Acima do peso ideal!";
            }
            else{
                classificacao ="Obeso!";
            }
        }
        return classificacao;
    }
}
