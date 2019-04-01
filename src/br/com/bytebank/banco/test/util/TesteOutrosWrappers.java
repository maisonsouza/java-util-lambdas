package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

    public static void main(String[] args) {

        int numero = 14;
        Integer refNumero = new Integer(numero); //Autoboxing
        System.out.println(refNumero.intValue()); //Unboxing

        double numeroReal = 14.25;
        Double refNumeroReal = new Double(numeroReal);
        System.out.println(refNumeroReal.doubleValue());

        boolean bolleano = true;
        Boolean refBoolean = Boolean.TRUE;
        System.out.println(refBoolean.booleanValue());

        Number numeroNovo = Float.valueOf(29);
        List<Number> lista = new ArrayList<>();
        lista.add(0);
        lista.add(0.5);
        lista.add(23.34f);


    }
}
