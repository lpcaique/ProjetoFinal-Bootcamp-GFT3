package projeto.banco;

import com.sun.tools.javac.Main;

public abstract class Conta extends Main {

    //Gerador de Agência (Nº padrão 12)
    private static final int AGENCIA_PADRAO = 12;
    //Gerador de Nº de Conta (sequencial)
    private static int SEQUENCIAL = 1;

    //Declaração das variáveis que geram agência, número e saldo
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String titular;

    //Criação de novas contas no banco
    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    //Função sacar
    public boolean saque(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            return true;
        }
        else return false;
    }

    //Função depositar
    public boolean depositar(double valor) {saldo += valor; return true;}

   //Função transferir
    public boolean transferir(double valor, Conta contaDestino) {
        if(valor <= saldo) {
            this.saque(valor);
            contaDestino.depositar(valor);
            return true;
        }
        else return false;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    //Gera resumo da conta que é usado como saldo/extrato
    protected void imprimirInfos() {
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
    }

}
