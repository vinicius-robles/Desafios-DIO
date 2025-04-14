package org.example.Cartao;

import org.example.Cliente;

public class CartaoDebito extends Cartao{
    public CartaoDebito(Cliente cliente) {
        super(cliente);
    }

    public void criarNovoCartao() {
        System.out.println("=== Dados Cartão de Débito ===");
        super.imprimirInfosComunsCartao();
    }
}
