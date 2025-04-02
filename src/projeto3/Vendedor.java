package projeto3;

public non-sealed class Vendedor extends Empregado {
    private double porcentagemDeVendas;

    public double getPorcentagemDeVendas() {
        return porcentagemDeVendas;
    }

    public void setPorcentagemDeVendas(double porcentagemDeVendas) {
        this.porcentagemDeVendas = porcentagemDeVendas;
    }
}
