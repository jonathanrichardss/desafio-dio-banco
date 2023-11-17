import enums.IdTipoClienteEnum;
import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cliente cliente1 = new Cliente();
        cliente1.setNome("John Doe");
        cliente1.setIdTipoClienteEnum(IdTipoClienteEnum.PESSOA_FISICA);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Jane Doe");
        cliente2.setIdTipoClienteEnum(IdTipoClienteEnum.PESSOA_JURIDICA);

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(1000);
        cc.imprimirExtrato();

        //cc.sacar(120);
        Conta pp = new ContaPoupanca(cliente2);
        pp.imprimirExtrato();


        cc.transferir(20, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}