public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException{
        ContaCorrente contaCorrente = new ContaCorrente(100, 1);
        contaCorrente.depositar(200);
        ContaPoupanca contaPoupanca = new ContaPoupanca(100, 2);
        contaCorrente.transfere(10.00, contaPoupanca);
        System.out.println("CC:" + contaCorrente.getSaldo());
        System.out.println("CP:" + contaPoupanca.getSaldo());
    }
}
