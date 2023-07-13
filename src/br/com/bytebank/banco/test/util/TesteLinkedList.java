package br.com.bytebank.banco.test.util;

import java.util.LinkedList;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TesteLinkedList {
    public static void main(String[] args){

        //Generics
        LinkedList<Conta> lista = new LinkedList<Conta>();
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
