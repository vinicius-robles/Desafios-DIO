package org.example;

import lombok.Data;

import java.util.Scanner;

@Data

public class Cliente {
    private String nome;

    public void criarNomeTitular() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("Informe o nome do titular: ");
        setNome(scanner.next());
    }
}
