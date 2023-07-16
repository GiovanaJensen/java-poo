package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.ArrayList;

public class TesteWrappers {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);

        String string = "12";
        int numero = Integer.parseInt(string);
        //int numero = Integer.valueOf(string); // outro jeito de passar para inteiro
        System.out.println(numero);
    }
}
