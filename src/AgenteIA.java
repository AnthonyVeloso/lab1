

public class AgenteIA {
    public void processarPrompt(String prompt) throws FalhaProcessamentoAgenteException {
        if (prompt == null || prompt.isEmpty()) {
            throw new FalhaProcessamentoAgenteException("O prompt não pode estar vazio.");
        }
        if (prompt.length() > 100) {
            throw new FalhaProcessamentoAgenteException("Prompt muito longo para o modelo atual.");
        }
        System.out.println("Agente processando: " + prompt);
    }
    public void verificarSeguranca(String prompt) throws PromptInadequadoException {
        if (prompt.equalsIgnoreCase("hackear") || prompt.equalsIgnoreCase("roubar")) {
            throw  new PromptInadequadoException("Esse prompt é considerado inadequado, tente outro!");
            }
        }
    public void chamarModeloExterno() throws ErroComunicacaoIAException {
        double random = Math.random();
        if (random > 0.7){
            throw new ErroComunicacaoIAException("Falha de conexão, o tempo foi excedido!");
            }
        }
    
}