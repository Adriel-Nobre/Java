package testePol;

public class Relatorio {

    public void relatorioPagamento(Funcionario funcionario){

        System.out.println("Nome do funcionario: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        if(funcionario instanceof Gerente){
            System.out.println("Valor da comissao: " + (((Gerente) funcionario).getComissao()));
        }
        if(funcionario instanceof Vendedor){
            System.out.println("Total de vendas: "+(((Vendedor) funcionario).getTotalVendas()));
        }
    }


}
