public class PluginGeradorCodigo implements IAcaoAgente {
    public String executar(String comando) throws FalhaProcessamentoAgenteException {
        if(comando.length() > 50){
            throw new FalhaProcessamentoAgenteException("Comando muito grande para gerar código!");
        }
        return "Snippet de código Java gerado para: " + comando;
    }

}