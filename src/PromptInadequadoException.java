public class PromptInadequadoException extends Exception{
    private String prompt;

    public PromptInadequadoException (String prompt){
        super(prompt);
        this.prompt = prompt;
    }

    public String getPrompt () {return prompt;}
}