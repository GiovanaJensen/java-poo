package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
// import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
public class TestesLambda {

        public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        System.out.println("---------");

        //lambda
        lista.sort((Conta c1, Conta c2) -> { 
                return Integer.compare(c1.getNumero(), c2.getNumero());
            }    
        );

         //lambda
         Comparator<Conta> comparator = (Conta conta1, Conta conta2) ->{
                String nomeCliente1 = conta1.getTitular().getNome();
                String nomeCliente2 = conta2.getTitular().getNome();
                return nomeCliente1.compareTo(nomeCliente2);
        };

        
        lista.sort(comparator);

        lista.forEach((Conta c1) -> System.out.println(c1));

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }

}