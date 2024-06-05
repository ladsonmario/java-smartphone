package apps.telephone;

import actions.Actions;

public class GoogleContact extends Actions implements Telephone {
    private String appName = "Google Contact";

    public String getAppName() {
        return appName;
    }

    public void answer() {
        System.out.println("Ligação atendida!");
    }

    public void call(String number) {
        System.out.println("Discando para: " + number);
    }

    public void disconnect() {
        System.out.println("Ligação encerrada!");
    }

    public void startVoicemail() {
        unanswered();
        System.out.println("Correio de voz inciado!");
    }

    private void unanswered() {
        System.out.println("Ligação não atendida!");
    }
}
