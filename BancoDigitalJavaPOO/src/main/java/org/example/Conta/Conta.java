package org.example.Conta;


import lombok.Data;
import org.example.Cliente;
import java.util.Random;

@Data

public abstract class Conta implements IConta {
    private static final Random random = new Random();

    private static int AGENCIA_PADRAO = 1423;
//    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected double saldo;
    protected Cliente cliente;
    private final String numeroConta;


    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = gerarNumeroConta();
        this.saldo = 0.0;
    }

    public String gerarNumeroConta() {
        int numero = random.nextInt(100000000);
        int digito = random.nextInt(10);
        return String.format("%08d-%d", numero, digito);
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %d%n", this.agencia);
        System.out.printf("Conta: %s%n", this.numeroConta);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
