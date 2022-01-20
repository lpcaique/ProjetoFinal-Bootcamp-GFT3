package projeto.banco.tipoconta;
import projeto.banco.Conta;

public class ContaCorrente extends Conta {

    public void imprimirExtrato() {
        System.out.println("-=-=-= Extrato Conta Corrente -=-=-=");
        super.imprimirInfos();
    }

    public void  valorDisponivel() {

    }
}
