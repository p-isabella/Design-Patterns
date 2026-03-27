public class Main{
public static void main(String[] args) {
    Notificacao notificacao1 = fabricaNotificacao.criar("SMS");
    notificacao1.enviar("oiii");
    }
}