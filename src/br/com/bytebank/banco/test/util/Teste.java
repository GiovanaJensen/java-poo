package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        ContaCorrente cc = new ContaCorrente(11,22);
        ContaPoupanca cp = new ContaPoupanca(22,33);

        lista.add(cc);
        lista.add(cp);
        System.out.println(lista.size());

        for(Object objectReferencia : lista){
            System.out.println(objectReferencia);
        }
    }
    
}
