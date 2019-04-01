package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenaçãoLista {
    public static void main(String[] args) {
        Conta c1 = new ContaPoupanca(1,1);
        c1.deposita(33);

        Conta c2 = new ContaCorrente(2,11);
        c1.deposita(44);

        Conta c3 = new ContaPoupanca(2,2);
        c1.deposita(55);

        Conta c4 = new ContaCorrente(2,3);
        c1.deposita(66);

        List <Conta> lista = new ArrayList<Conta>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        for(Conta contas: lista){
            System.out.println(contas);
        }
        lista.sort(comparator);
        System.out.println("----------------------------------------------------");
        for(Conta contas: lista){
            System.out.println(contas);
        }


    }


}

class NumeroDaContaComparator implements Comparator <Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(),c2.getNumero());
    }
}
