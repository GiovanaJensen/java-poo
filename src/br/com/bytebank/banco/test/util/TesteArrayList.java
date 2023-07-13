package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayList {
    public static void main(String[] args){

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();
        ContaCorrente cc = new ContaCorrente(11,22);
        ContaPoupanca cp = new ContaPoupanca(22,33);

        lista.add(cc);
        lista.add(cp);
        System.out.println(lista.size());

        for(Conta conta : lista){
            System.out.println(conta);
        }
    }
    
}
