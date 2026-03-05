import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AgenteIA agente = new AgenteIA();

        ArrayList<AgenteIA> agentes = new ArrayList<>();
        IAcaoAgente pesquisaWeb = new PluginPesquisaWeb();
        IAcaoAgente pesquisaCodigo = new PluginGeradorCodigo();
        try {
            agente.usarHabilidade(pesquisaWeb, "Como aprender Java");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            agente.usarHabilidade(pesquisaCodigo, "Como aprender Java");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            agente.usarHabilidade(pesquisaWeb, "hackear");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
