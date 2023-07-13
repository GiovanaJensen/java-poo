package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayEquals {
    public static void main(String[] args){

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();
        Conta cc = new ContaCorrente(22,33);
        Conta cp = new ContaPoupanca(22,33);

        lista.add(cc);
        lista.add(cp);
        System.out.println(lista.size());

        boolean igual = lista.contains(cc);   
        System.out.println(igual);

        for(Conta conta : lista){
            System.out.println(conta);
        }

        
    }
    
}
