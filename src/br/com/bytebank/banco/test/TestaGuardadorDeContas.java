package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TestaGuardadorDeContas {

    public static void main(String[] args) {
        Object guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22, 11);


        Conta cc2 = new ContaCorrente(22, 22);
        ((GuardadorDeContas) guardador).adiciona(cc);



        System.out.println(((GuardadorDeContas) guardador).getQuantidadeDeElementos());
        System.out.println(  ((GuardadorDeContas) guardador).getReferencia(0));
    }

}
