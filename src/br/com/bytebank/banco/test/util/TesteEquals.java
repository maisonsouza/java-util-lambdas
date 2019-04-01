package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class TesteEquals {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        Conta cc3 = new ContaCorrente(123, 123);
        Conta cp4 = new ContaPoupanca(124, 123);
        lista.add(cc3);
        lista.add(cp4);
        System.out.println(lista.size());
        lista.remove(0);
        Conta cc2 = new ContaCorrente(22, 11);
        System.out.println(lista.size());
        System.out.println(lista.get(0));


        for(Object elemento: lista){
            System.out.println(elemento);
        }

        System.out.println(lista.contains(cc3));
        System.out.println(lista.contains(cp4));
        System.out.println(cc3.equals(cp4));


    }
}
