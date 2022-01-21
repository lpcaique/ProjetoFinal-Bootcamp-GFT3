package projeto.banco.tipoconta;

import projeto.banco.Conta;

public class ContaPoupanca extends Conta {

    //Gera extrato bancário
    public void imprimirExtrato() {
        super.imprimirInfos();
    }
}
