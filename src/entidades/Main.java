public class Main {
    public static void main(String[] args) {
        Cliente cleiton = new Cliente();
        cleiton.setNome("Cleiton");
        Cliente jane = new Cliente();
        jane.setNome("Jane");

        Conta contaCorrente = new ContaCorrente(cleiton);
        Conta contaPoupanca = new ContaPoupanca(jane);

        contaCorrente.saldo = 100;
        contaCorrente.transferir(100, contaPoupanca);
        // contaPoupanca.saldo = 350;

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }

}
