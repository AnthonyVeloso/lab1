public class AgenteIA {
    public void usarHabilidade(IAcaoAgente ferramenta, String comando){
        try{
            System.out.println(ferramenta.executar(comando));

        }catch(Exception e){
            System.out.println("Erro ao usar ferramenta: " + e.getMessage());
        }

    }
}
