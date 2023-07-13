package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
    public static void main(String[] args){
        Conta[] contas = new Conta[5];

        ContaCorrente contaCorrente1 = new ContaCorrente(11,22);
        ContaCorrente contaCorrente2 = new ContaCorrente(22,33);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(33,44);

        contas[0] = contaCorrente1;
        contas[1] = contaCorrente2;
        contas[2] = contaPoupanca1;

        System.out.println(contas[0].getNumero());
        System.out.println(contas[1].getNumero());  

        ContaCorrente referencia = (ContaCorrente) contas[1]; //type cast
        System.out.println(referencia);
    }
}
