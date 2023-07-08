package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencia {
    public static void main(String[] args){
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente contaCorrente1 = new ContaCorrente(11,22);
        ContaCorrente contaCorrente2 = new ContaCorrente(22,33);

        contas[0] = contaCorrente1;
        contas[1] = contaCorrente2;

        System.out.println(contas[0].getNumero());
        System.out.println(contas[1].getNumero());  

    }
}
