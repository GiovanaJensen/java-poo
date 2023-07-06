package br.com.bytebank.banco.modelo;
public class CalculadorDeImposto {
    
    protected double totalImposto;

    public void registra(Tributavel tributavel){
        double valor = tributavel.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto(){
        return this.totalImposto;
    }
}
