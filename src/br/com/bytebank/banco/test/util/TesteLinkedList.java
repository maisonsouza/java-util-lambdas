package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {
        LinkedList<Conta> lista = new LinkedList<Conta>();
        Conta cc4 = new ContaCorrente(121, 123);
        Conta cp4 = new ContaPoupanca(122, 123);
        lista.add(cc4);
        lista.add(cp4);


        for (Object elemento : lista) {
            System.out.println(elemento);
        }

        System.out.println(lista.size());
        lista.remove(0);
        Conta cc2 = new ContaCorrente(22, 11);
        System.out.println(lista.size());
        System.out.println(lista.get(0));
        System.out.println(lista.contains(cc4));
        System.out.println(lista.contains(cp4));
        System.out.println(cc4.equals(cp4));


    }
}
