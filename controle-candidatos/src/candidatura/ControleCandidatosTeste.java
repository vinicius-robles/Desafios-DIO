package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatosTeste {
    public static void main(String[] args) {
        String candidatos[] = { "João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas",
                "Fernanda" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato " + candidato +
                    " solicitou este valor de salário %.2f %n", salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato " + candidato + " foi selecionado para a vaga. %n");
                candidatosSelecionados++;
            }
            candidatoAtual++;

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
