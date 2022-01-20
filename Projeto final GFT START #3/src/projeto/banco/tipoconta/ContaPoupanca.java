package projeto.banco.tipoconta;

import projeto.banco.Conta;

public class ContaPoupanca extends Conta {

    public void imprimirExtrato() {
        System.out.println("-=-=-= Extrato Conta Poupança -=-=-=");
        super.imprimirInfos();
    }
}
