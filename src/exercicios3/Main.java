package exercicios3;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();


    public static void main(String[] args) {

        var option = -1;

        do {
            System.out.println("Escolha uma das opções");
            System.out.println("1- Dar banho no pet");
            System.out.println("2- Abastercer a maquina com água ou shampoo");
            System.out.println("3- Verificar o nivel da água ou shampoo da maquina");
            System.out.println("4- Verificar se tem Pet no banho");
            System.out.println("5- Colocar Pet na Maquina");
            System.out.println("6- Retirar pet da maquina");
            System.out.println("7- Limpar maquina");
            System.out.println("0- Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.colocarPet();
                case 2 -> colocarAguaEShampoo();
                case 3 -> verificacaoAguaEShampoo();
                case 4 -> checharSeTemPetNaMaquina();
                case 5 -> colocarPetNaMaquina();
                case 6 -> petMachine.removerPet();
                case 7 -> petMachine.limparMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção invalida");
            }

        }while (true);
    }

    private static void colocarAguaEShampoo(){
        System.out.println("Tentando colocar agua na maquina");
        petMachine.adicionarAgua();
        System.out.println("Tentando colocar shampoo na maquina");
        petMachine.adicionarShampoo();

    }

    private static void verificacaoAguaEShampoo() {
        var quantidadeAgua = petMachine.getAgua();
        var quantidadeDeShampoo = petMachine.getShampoo();
        System.out.println("A maquina está no momento atual com " + quantidadeAgua + " litros de água e " + quantidadeDeShampoo + " litros de shampoo");
    }

    private static void checharSeTemPetNaMaquina() {
       var temPet = petMachine.temPet();
        System.out.println(temPet ? "Tem pet na maquina" : "Não tem pet na Maquina");
    }


    public static void colocarPetNaMaquina(){
        var nome = "";
        while (nome == null || nome.isEmpty()){
            System.out.println("Informe o nome do pet");
            nome = scanner.next();
        }

        var pet = new Pet(nome);
        petMachine.setPet(pet);
    }

}
