package projeto2;

public class Main {
    public static void main(String[] args) {

        var male = new Pessoa("Joao");
        male.incIdade();
        var female = new Pessoa("Maria");
        female.incIdade();

        System.out.println(male.getNome() + " " + male.getIdade());
        System.out.println(female.getNome() + " " + female.getIdade());

    }
}
