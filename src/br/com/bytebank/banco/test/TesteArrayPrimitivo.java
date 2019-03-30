package br.com.bytebank.banco.test;

public class TesteArrayPrimitivo {

    public static void main(String[] args) {

        int[] idades = new int[5];

        for(int indice=0;indice<idades.length;indice++){
            idades[indice] = indice * indice;
        }

        for(int indice=0;indice<idades.length;indice++){
            System.out.println(idades[indice]);
        }
    }
}
