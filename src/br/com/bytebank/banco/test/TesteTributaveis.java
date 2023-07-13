package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente(222,333);
        contaCorrente.depositar(100.0);
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadorDeImposto calculador = new CalculadorDeImposto();
        calculador.registra(seguro);
        calculador.registra(contaCorrente);
        System.out.println(calculador.getTotalImposto());
    }
}
