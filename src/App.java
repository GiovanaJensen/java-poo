public class App {
    public static void main(String[] arg){
        Conta primeiraConta = new Conta();
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
        giovana.nome = "Giovana";
        primeiraConta.titular = giovana;
        System.out.println(primeiraConta.titular);
        System.out.println(giovana);
    }
}
