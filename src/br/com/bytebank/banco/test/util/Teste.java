package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>();
        Conta cc1 = new ContaCorrente(121, 123);
        Conta cp1 = new ContaPoupanca(122, 123);
        lista.add(cc1);
        lista.add(cp1);
        System.out.println(lista.size());
        lista.remove(0);
        Conta cc2 = new ContaCorrente(22, 11);
        System.out.println(lista.size());
        System.out.println(lista.get(0));

        for(Object elemento: lista){
            System.out.println(elemento);
        }


    }
}
