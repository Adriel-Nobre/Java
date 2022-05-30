package testePol;

public abstract class Funcionario {

    protected String nome;
    protected int salario;


    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
