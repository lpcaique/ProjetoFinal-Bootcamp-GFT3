package projeto.banco.tipoconta;

import projeto.banco.Conta;

public class ContaCorrente extends Conta {

    //Gera extrato bancário
    public void imprimirExtrato() {
        super.imprimirInfos();
    }
}
