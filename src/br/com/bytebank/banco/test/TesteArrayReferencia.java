package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
    public static void main(String[] args) {

        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(124,12563);
        ContaPoupanca cp1 = new ContaPoupanca(124,12563);
        contas[0]=cc1;
        contas[1]=cp1;

        System.out.println(cp1.getNumero());
        System.out.println(cc1.getNumero());
        System.out.println(contas[1].getNumero());
        System.out.println(contas[1]==cp1 ? true: false);
    }
}
