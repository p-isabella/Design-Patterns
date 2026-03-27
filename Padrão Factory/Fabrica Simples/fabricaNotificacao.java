public class fabricaNotificacao {
    static Notificacao criar(String tipoNotificacao){
        if ("SMS".equals(tipoNotificacao)) {
            return new SMSNotificacao();
        } else if ("PopUp".equals(tipoNotificacao)) {
            return new PopUpNotificacao();
        } else if ("email".equals(tipoNotificacao)) {
            return new EmailNotificacao();
        } else {
            System.out.println("Não existe esse tipo de notificação.");
            return null;
        }
    } 
}