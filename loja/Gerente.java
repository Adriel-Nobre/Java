package testePol;

public class Gerente extends Funcionario{


    private int comissao;

    public Gerente(String nome, int salario, int comissao) {
        super(nome, salario);
        this.comissao=comissao;
    }


    @Override
    public void calculaSalario() {

        this.salario = this.salario+comissao;

    }


    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }


}
