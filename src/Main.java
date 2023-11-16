public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("John Doe");
        cliente1.setIdTipoClienteEnum(idTipoClienteEnum.PESSOA_FISICA);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Jane Doe");
        cliente2.setIdTipoClienteEnum(idTipoClienteEnum.PESSOA_JURIDICA);

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(10);
        cc.imprimirExtrato();

        //cc.sacar(120);
        Conta pp = new ContaPoupanca(cliente2);
        pp.imprimirExtrato();


        cc.transferir(20, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}