package projeto3;

public class Main {
    public static void main(String[] args) {

        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());

    }

    public static void printEmpregado(Empregado empregado){

        System.out.printf("=======%s=======\n", empregado.getClass().getSimpleName());

        switch (empregado){
            case Gerente gerente -> {
                gerente.setCodigo("123");
                gerente.setNome("Joao");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha("1234");
                gerente.setComissao(1200);

                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getNome());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.getComissao());

            }
            case Vendedor vendedor -> {

                vendedor.setCodigo("456");
                vendedor.setNome("Lucas");
                vendedor.setSalario(2700);
                vendedor.setPorcentagemDeVendas(10);


                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getPorcentagemDeVendas());
            }
        }

        System.out.println("==============");

    }

}
