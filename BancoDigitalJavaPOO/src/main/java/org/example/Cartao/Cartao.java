package org.example.Cartao;

import lombok.Data;
import org.example.Cliente;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Data

public abstract class Cartao implements ICartao {

    private static final Random random = new Random();

    protected final String numeroCartao;
    protected final String dataValidade;
    protected final String cvv;
    protected Cliente cliente;

    public Cartao(Cliente cliente){
        this.numeroCartao = gerarNumeroCartao();
        this.dataValidade = gerarDataValidade();
        this.cvv = gerarCVV();
        this.cliente = cliente;
    }


    @Override
    public String gerarNumeroCartao() {
        StringBuilder numero = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            numero.append(random.nextInt(10));
        }
        return numero.toString().replaceAll("(.{4})", "$1 ").trim();
    }

    @Override
    public String gerarCVV() {
        return String.format("%03d", random.nextInt(1000));
    }

    @Override
    public String gerarDataValidade() {
        return LocalDate.now()
                .plusYears(5)
                .format(DateTimeFormatter.ofPattern("MM/yy"));
    }

    public void imprimirInfosComunsCartao() {


        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Número: %s%n", this.numeroCartao);
        System.out.printf("Val.: %s%n", this.dataValidade);
        System.out.printf("cvv: %s%n", this.cvv);
    }

}