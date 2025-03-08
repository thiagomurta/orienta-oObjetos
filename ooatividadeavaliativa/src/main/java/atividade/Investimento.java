package atividade;

public class Investimento extends CarteiraInvestimento{


    public void resgatar(float retirarSaldo) {
        float taxaRetirada = retirarSaldo + (retirarSaldo * 0.01f);
        if(this.saldo <= 0 || this.saldo < taxaRetirada){
            throw new IllegalArgumentException("Não possui saldo!");
        }
        this.saldo = this.saldo - taxaRetirada;
    }
}
