public class Main {
    public static void main(String[] args) {
        SensorPresenca sensor = new SensorPresenca();

        System.out.println("Cor inicial: " + ControladorSemaforo.PegaObjeto().mostraCorAtual());

        sensor.detectaCarro();

        System.out.println("Cor após sensor: " + ControladorSemaforo.PegaObjeto().mostraCorAtual());

        sensor.fechaSemaforo();

        System.out.println("Cor depois do carro passar: " + ControladorSemaforo.PegaObjeto().mostraCorAtual());
    }
}