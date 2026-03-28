public class SensorPresenca {
    public void detectaCarro(){
        ControladorSemaforo s1 = ControladorSemaforo.PegaObjeto();

        System.out.println("****Vruum****, carro passando");
        s1.registrarNovaCor("Verde");
    }

    public void fechaSemaforo(){
        ControladorSemaforo s1 = ControladorSemaforo.PegaObjeto();

        s1.registrarNovaCor("Vermelho");
    }
}


