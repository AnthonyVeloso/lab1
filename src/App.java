import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        AgenteIA agente = new AgenteIA();

        String[] prompts = {
            "Explique orientação a objetos",
            "Como hackear um sistema",
            "O que é Java?",
            "Como roubar dados",
            "Explique microsserviços"
        };

        for (int i = 0; i < prompts.length; i++) {

            try {
                agente.processarPrompt(prompts[i]);

            } catch (Exception e) {
                String horario = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

                System.err.println(
                    "[LOG-AGENTE] [" + horario + "] Erro: " + e.getMessage()
                );
            }
        }
    }
}
