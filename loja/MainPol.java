package MainJava;

import testePol.Gerente;
import testePol.Relatorio;
import testePol.Vendedor;

public class MainPol {

    public static void main(String[] args) {


        Vendedor v = new Vendedor("Ciclano",1000,500);
        Gerente g = new Gerente("Fulano",2000,1000);
        Relatorio relatorio = new Relatorio();



        v.calculaSalario();
        g.calculaSalario();

        relatorio.relatorioPagamento(v);
        System.out.println("------------");
        relatorio.relatorioPagamento(g);


    }

}
