public class Main {
    public static void main(String[] args) {

        Cliente ronaldo = new Cliente();
        ronaldo.setNome("Ronaldo");

        Conta cc = new ContaCorrente(ronaldo);
        cc.depositar(120);

        Conta pp = new ContaPoupanca(ronaldo);
        cc.transferir(120, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
