package exercicios3;

public class PetMachine {

    private boolean limpo = true;

    private int agua = 30;

    private int shampoo = 20;

    private Pet pet;

    public void colocarPet(){

        if (this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho");
            return;
        }

        this.agua -= 10;
        this.shampoo -= 2;
        pet.setLimpo(true);
        System.out.println("O pet" + pet.getNome() + "esta limpo");

    }

    public void adicionarAgua() {
        if (agua == 30) {
            System.out.println("Capacidade maxima atingida");
            return;
        }

        agua += 2;
    }

    public void adicionarShampoo() {
        if (shampoo == 10) {
            System.out.println("Capacidade maxima atingida");
            return;
        }

        shampoo += 2;
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean temPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.limpo){
            System.out.println("A maquina está suja, para colocar o pet é necessario limpa-la");
            return;
        }
        if (temPet()){
            System.out.println("O pet " + this.pet.getNome() + " está na maquina nesse momento");
            return;
        }


        this.pet = pet;
        System.out.println("O pet " + pet.getNome() + " foi colocado na maquina");

    }

    public void removerPet(){
        this.limpo = this.pet.isLimpo();
        System.out.println("O pet " + this.pet.getNome() + " está limpo");
        this.pet = null;

    }

    public void limparMaquina() {

        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A maquina foi limpa");

    }

}
