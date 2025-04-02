package projeto3;

public class Main {
    public static void main(String[] args) {

        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());

    }

    public static void printEmpregado(Empregado empregado){

        empregado.setNome("Joao");
        ((Gerente)empregado).setLogin("joao");
        ((Gerente)empregado).setSenha("1234");


        System.out.printf("=======%s=======\n",empregado.getClass().getSimpleName());
        System.out.println(empregado.getNome());
        System.out.println(((Gerente)empregado).getLogin());
        System.out.println(((Gerente)empregado).getSenha());
    }

}
