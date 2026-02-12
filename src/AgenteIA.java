

public class AgenteIA {
    public void processarPrompt(String prompt)
            throws FalhaProcessamentoAgenteException,
            PromptInadequadoException,
            ErroComunicacaoIAException {

        verificarSeguranca(prompt);
        chamarModeloExterno();

        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException("O prompt não pode estar vazio.");
        }

        System.out.println("Agente processando: " + prompt);
    }


    public void verificarSeguranca(String prompt)
            throws PromptInadequadoException {

        String p = prompt.toLowerCase();

        if (p.contains("hackear") || p.contains("roubar")) {
            throw new PromptInadequadoException(
                    "Esse prompt é considerado inadequado, tente outro!"
            );
        }
    }

    public void chamarModeloExterno() throws ErroComunicacaoIAException {
        double random = Math.random();
        if (random > 0.7){
            throw new ErroComunicacaoIAException("Falha de conexão, o tempo foi excedido!");
            }
        }
    
}