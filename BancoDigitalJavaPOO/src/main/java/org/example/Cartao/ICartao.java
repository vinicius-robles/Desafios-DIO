package org.example.Cartao;

import org.example.Cliente;
import org.example.Conta.IConta;

public interface ICartao {

    String gerarNumeroCartao();
    String gerarCVV();
    String gerarDataValidade();
    void criarNovoCartao();
}