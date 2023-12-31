package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSacar {

    public static void main(String[] args){
        Conta conta = new ContaCorrente(123, 321);

        conta.depositar(200.0);

        try {
            conta.sacar(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(conta.getSaldo());
    }
}
