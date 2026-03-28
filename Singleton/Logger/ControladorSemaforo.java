public class ControladorSemaforo {
    
    private ControladorSemaforo(){};
    private static ControladorSemaforo objeto;
    private String corAtual = "Vermelho";

    public static ControladorSemaforo PegaObjeto() {
        if (objeto == null) {
            objeto = new ControladorSemaforo();
        }
        return objeto;
    }

    public void registrarNovaCor(String novaCor){
        corAtual = novaCor;
    };

    public String mostraCorAtual(){
        return corAtual;
    }

}
