package contabanco;

public class ContaBancoTeste {

    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(10001);
        conta1.setTitular("João da Gomes");
        conta1.abrirConta("CC");
        conta1.estadoAtual();

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(10002);
        conta2.setTitular("Maria da Silva");
        conta2.abrirConta("CP");
        conta2.estadoAtual();

        ContaBanco conta3 = new ContaBanco();
        conta3.setNumConta(10003);
        conta3.setTitular("José da Rocha");
        conta3.abrirConta("CC");
        conta3.depositar(500);
        conta3.estadoAtual();
        conta3.sacar(280);
        conta3.fecharConta();
    }
}