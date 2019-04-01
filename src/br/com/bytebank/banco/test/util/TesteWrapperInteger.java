package br.com.bytebank.banco.test.util;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        int idade = 32;
        int[] idades = new int[5];
        List <Integer> numeros = new ArrayList<>();
        numeros.add(idade);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);


    }
}
