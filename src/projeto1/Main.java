package projeto1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou o metodo projeto1.Main");
        a();
        System.out.println("Finalizou o metodo projeto1.Main");
    }

    static void a() {
        System.out.println("Iniciou o Metodo A");
        b();
        System.out.println("Finalizou o metodo A");
    }

    static void b() {
        System.out.println("Iniciou o metodo B");
        int somaB = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
            somaB += i;
        }
        c(somaB);
        System.out.println("Finalizou o metodo B");
    }

    static void c(int somaB) {
        System.out.println("Iniciou o metodo C");
        d(somaB);
        System.out.println("Finalizou o metodo C");
    }

    static void d(int somaB) {
        int somaD = 0;
        System.out.println("Iniciou o metodo D");
        for (int i = 4; i >= 0; --i) {
            System.out.println(i);
            somaD += i;
        }
        e(somaB, somaD);
        System.out.println("Finalizou o metodo D");
    }

    static void e(int somaB, int somaD) {
        System.out.println("Iniciou o metodo E");
        int somaTotal = somaB + somaD;
        System.out.println("Soma de todos os valores um por um dos loops B e D é: " + somaTotal);
        System.out.println("Finalizou o metodo E");
    }
}
