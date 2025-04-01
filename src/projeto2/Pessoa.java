package projeto2;

import java.time.OffsetDateTime;

public class Pessoa {

    private final String nome;

    private int idade;

    private int ultimoAnoIdadeInc = OffsetDateTime.now().getYear();

    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void incIdade(){
        if (this.ultimoAnoIdadeInc >= OffsetDateTime.now().getYear()) return;
        this.idade +=1;
        this.ultimoAnoIdadeInc = OffsetDateTime.now().getYear();
    }
}
