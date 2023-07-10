package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteGuardadorContas {
    public static void main(String[] args){
        GuardadorDeContas guardador = new GuardadorDeContas();
        ContaCorrente contaCorrente1 = new ContaCorrente(22,11);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(22,33);
        guardador.adiciona(contaCorrente1);
        guardador.adiciona(contaPoupanca1);
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);
        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref);
    }
}
