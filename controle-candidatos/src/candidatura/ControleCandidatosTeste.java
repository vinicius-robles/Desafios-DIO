package candidatura;

// import java.util.concurrent.ThreadLocalRandom;

// public class ControleCandidatosTeste {
// public static void main(String[] args) {
// selecaoCandidatos();

// }

// static void imprimirCandidatos() {
// String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };

// for (int i = 0; i < candidatos.length; i++) {
// System.out.println("O candidato de nº " + (i + 1) + " é o " + candidatos[i]);
// }

// System.out.println("Forma abreviada de iteração for each");

// for (String candidato : candidatos) {
// System.out.println("O candidato selecionado foi " + candidato);
// }
// }

// static void selecaoCandidatos() {
// String candidatos[] = { "João", "Maria", "José", "Ana", "Carlos", "Mariana",
// "Pedro", "Paula", "Lucas",
// "Fernanda" };

// int candidatosSelecionados = 0;
// int candidatoAtual = 0;
// double salarioBase = 2000.00;

// while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
// String candidato = candidatos[candidatoAtual];
// double salarioPretendido = valorPretendido();

// System.out.printf("O candidato " + candidato +
// " solicitou este valor de salário %.2f %n", salarioPretendido);

// if (salarioBase >= salarioPretendido) {
// System.out.printf("O candidato " + candidato + " foi selecionado para a vaga.
// %n");
// candidatosSelecionados++;
// }
// candidatoAtual++;

// }

// }

// static double valorPretendido() {
// return ThreadLocalRandom.current().nextDouble(1800, 2200);
// }
// }

// ------------------------------------

// import java.util.concurrent.ThreadLocalRandom;

// public class ControleCandidatosTeste {
// public static void main(String[] args) {
// selecaoCandidatos();
// }

// static void selecaoCandidatos() {
// String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos", "Mariana",
// "Pedro", "Paula", "Lucas", "Fernanda" };
// String[] candidatosSelecionados = new String[5]; // Array para armazenar os
// candidatos selecionados
// int candidatosSelecionadosCount = 0;
// int candidatoAtual = 0;
// double salarioBase = 2000.00;

// while (candidatosSelecionadosCount < 5 && candidatoAtual < candidatos.length)
// {
// String candidato = candidatos[candidatoAtual];
// double salarioPretendido = valorPretendido();

// System.out.printf("O candidato " + candidato + " solicitou este valor de
// salário %.2f %n", salarioPretendido);

// if (salarioBase >= salarioPretendido) {
// System.out.printf("O candidato " + candidato + " foi selecionado para a vaga.
// %n");
// candidatosSelecionados[candidatosSelecionadosCount] = candidato; // Adiciona
// o candidato selecionado ao array
// candidatosSelecionadosCount++;
// }
// candidatoAtual++;
// }

// // Imprime os nomes dos candidatos selecionados
// System.out.println("Candidatos Selecionados:");
// for (String nome : candidatosSelecionados) {
// if (nome != null) {
// System.out.println(nome);
// }
// }
// }

// static double valorPretendido() {
// return ThreadLocalRandom.current().nextDouble(1800, 2200);
// }
// }

// ------------------------------------

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatosTeste {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos", "Mariana",
                "Pedro", "Paula", "Lucas",
                "Fernanda" };
        List<String> candidatosSelecionados = new ArrayList<>(); // ArrayList para armazenar os candidatos selecionados
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados.size() < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato " + candidato + " solicitou este valor de salário %.2f %n",
                    salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato " + candidato + " foi selecionado para a vaga. %n");
                candidatosSelecionados.add(candidato); // Adiciona o candidato selecionado à lista
            }
            candidatoAtual++;
        }

        // Imprime os nomes dos candidatos selecionados
        System.out.println("Candidatos Selecionados:");
        for (String nome : candidatosSelecionados) {
            System.out.println(nome);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}