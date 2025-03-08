package atividade;

public abstract class CarteiraInvestimento {
    protected int numeroCarteira;
    protected float saldo;
    protected float taxa;

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        taxa = 0.0f;
        this.taxa = taxa;
    }

    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public void investir(float adicionarSaldo){
        this.saldo += adicionarSaldo - this.taxa;
    }

    public abstract void resgatar(float retirarSaldo);
}
