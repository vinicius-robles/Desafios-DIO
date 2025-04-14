package org.example.Conta;

import org.example.Cliente;

public class ContaPoupanca extends Conta{//extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}


