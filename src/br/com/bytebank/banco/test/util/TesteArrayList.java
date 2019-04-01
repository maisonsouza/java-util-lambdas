package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<Conta>();
        Conta cc1 = new ContaCorrente(121, 123);
        Conta cp1 = new ContaPoupanca(122, 123);
        lista.add(cc1);
        lista.add(cp1);


        for(Object elemento: lista){
            System.out.println(elemento);
        }


    }
}
