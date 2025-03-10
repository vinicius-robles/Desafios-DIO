package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
// import java.util.Scanner;

public class ControleCandidatos {
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Qual é o seu salário pretendido?");
        // double salarioPretendido = scanner.nextDouble();
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);

        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };
        selecaoCandidatos();
        imprimirCandidatos();

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            // elas precisarão sofrer alterações para finalizar o método e evitar um loop
            // infinito.
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " em " + tentativasRealizadas + " tentativas");
        } else {
            System.out.println(
                    "Não conseguimos contato com " + candidato + ", número máximo de tentativas "
                            + tentativasRealizadas);
        }
    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirCandidatos() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é o " + candidatos[i]);
        }

        System.out.println("Forma abreviada de iteração for each");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {

        /*
         * Começamos o raciocínio, adicionando o array de candidatos, cada um com seu
         * nome e pretensão salarial.
         * Em seguida, criamos duas variáveis para controlar o número de candidatos
         * escolhidos e o número de candidatos analisados.
         * Por fim, criamos um laço de repetição que irá rodar até que o número de
         * candidatos escolhidos seja igual a 5.
         * Dentro do laço, pegamos o candidato atual e o salário pretendido.
         * Em seguida, verificamos se o salário base é maior ou igual ao salário
         * pretendido.
         * Caso seja, o candidato é selecionado e o contador de candidatos selecionados
         * é incrementado.
         * Por fim, passamos para o próximo candidato.
         * Se o número de candidatos selecionados for igual a 5, o laço é interrompido.
         */

        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas",
                "Fernanda" };

        int candidatosSelecionados = 0; // contador de candidatos selecionados
        int candidatoAtual = 0; // contador de candidatos analisados
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual]; // pega o candidato atual do array de candidatos selecionados
            double salarioPretendido = valorPretendido(); // gera um salário pretendido aleatório

            System.out.printf("O candidato " + candidato +
                    " solicitou este valor de salário %.2f %n", salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato " + candidato + " foi selecionado para a vaga. %n");
                candidatosSelecionados++; // incrementa o contador de candidatos selecionados
            }
            candidatoAtual++; // passa para o próximo candidato
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
