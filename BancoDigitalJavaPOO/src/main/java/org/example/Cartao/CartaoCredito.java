package org.example.Cartao;

import org.example.Cliente;

public class CartaoCredito extends Cartao{

    public CartaoCredito(Cliente cliente) {
        super(cliente);
    }

    public void criarNovoCartao() {
        System.out.println("=== Dados Cartão de Crédito ===");
        super.imprimirInfosComunsCartao();

    }
}
