package org.example;

import lombok.Data;
import org.example.Cartao.Cartao;
import org.example.Cartao.CartaoCredito;
import org.example.Cartao.CartaoDebito;
import org.example.Conta.Conta;
import org.example.Conta.ContaCorrente;
import org.example.Conta.ContaPoupanca;

@Data
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Cartao credito = new CartaoCredito(cliente);
        Cartao debito = new CartaoDebito(cliente);
        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cliente.criarNomeTitular();

        credito.criarNovoCartao();
        debito.criarNovoCartao();

        corrente.imprimirExtrato();

        corrente.depositar(100);
        corrente.imprimirExtrato();
        corrente.transferir(55, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}