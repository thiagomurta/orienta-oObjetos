package atividade;

public class BolsaValores extends CarteiraInvestimento{

    @Override
    public void investir(float adicionarSaldo) {
        this.taxa = 50.0f;
    }

    public void resgatar(float retirarSaldo) {
        if(this.saldo <= 0 || this.saldo < retirarSaldo){
            throw new IllegalArgumentException("Não possui saldo!");
        }
        this.saldo -= retirarSaldo;
    }
}
