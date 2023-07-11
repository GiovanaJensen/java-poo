package br.com.bytebank.banco.modelo;
/*
 * Classe representa a moldura de uma classe 
 * @author Giovana Fernandes
 * @version 0.1
 */

public abstract class Conta{
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /*
     * Construtor para inicializar o objeto Conta a partir da agencia e do numero
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    @Override
    public String toString(){
        return " Agencia: " + this.agencia + " Numero:" + this.numero;
    }

    @Override
    public boolean equals(Object referencia){
        Conta conta = (Conta) referencia;

        if(this.agencia != conta.agencia){
            return false;
        }

        if(this.numero != conta.numero){
            return false;
        }

        return true;
    }
}