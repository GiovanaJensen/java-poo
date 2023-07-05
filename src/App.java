public class App {
    public static void main(String[] arg) throws SaldoInsuficienteException{
        Conta primeiraConta = new ContaCorrente(100,200);
        primeiraConta.depositar(200);
        System.out.println(primeiraConta.getSaldo());
        primeiraConta.depositar(primeiraConta.getSaldo() + 100);
        System.out.println(primeiraConta.getSaldo());
        primeiraConta.depositar(50);
        System.out.println(primeiraConta.getSaldo());
        primeiraConta.sacar(360);
        System.out.println(primeiraConta.getSaldo());

        //cliente ligando a conta

        Cliente giovana = new Cliente();
        giovana.setNome("Giovana");
        primeiraConta.setTitular(giovana);
        System.out.println(primeiraConta.getTitular().getNome());
        System.out.println(giovana);
        System.out.println(primeiraConta.getAgencia() + " " + primeiraConta.getNumero());
    }
}
