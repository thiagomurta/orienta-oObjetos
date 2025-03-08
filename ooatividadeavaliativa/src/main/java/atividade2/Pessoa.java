package atividade2;
// Thiago Silva Murta
public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new IllegalArgumentException("Pessoa sem nome");
        }
        this.nome = nome;
    }
}
