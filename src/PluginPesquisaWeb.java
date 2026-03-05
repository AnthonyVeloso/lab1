public class PluginPesquisaWeb implements IAcaoAgente {
    public String executar(String comando) throws PromptInadequadoException {

        if(comando.toLowerCase().contains("hackear") || comando.toLowerCase().contains("roubar")){
            throw new PromptInadequadoException("Comando proibido na pesquisa!");
        }

        return "Resultado da pesquisa no Google sobre: " + comando;
    }

}