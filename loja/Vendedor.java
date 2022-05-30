package testePol;

public class Vendedor extends Funcionario{


    private int totalVendas;

    public Vendedor(String nome, int salario, int totalVendas) {
        super(nome, salario);
        this.totalVendas=totalVendas;
    }


    @Override
    public void calculaSalario() {

        this.salario=this.salario+totalVendas;

    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

}
