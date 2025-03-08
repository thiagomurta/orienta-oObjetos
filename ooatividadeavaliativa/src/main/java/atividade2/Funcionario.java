package atividade2;

import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
// Thiago Silva Murta
public class Funcionario {
    private Cargo cargo;
    private Pessoa pessoa;
    private List<Dependente> dependentes;
    private List<Ocorrencia> ocorrencias;

    public float calcularSalarioLiquido(Date mes, Date dia){
        float valor = 0;
        return valor;
    }

    public List<String> exibirDependentes(){
        List<Date> lista = new ArrayList<>();
        for( List<Date> data : this.dependentes){
            lista.add(data);
        }
        return lista;
    }

    public void adicionaDependetes(Dependente dependente){
        this.dependentes.add(dependente);
    }
}
