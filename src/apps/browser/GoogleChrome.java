package apps.browser;

import actions.Actions;

public class GoogleChrome extends Actions implements InternetBrowser {
    private String appName = "Google Chrome";

    public String getAppName() {
        return appName;
    }

    public void reloadPage() {
        System.out.println("Recarregando página!");
    }

    public void openNewTab() {        
        System.out.println("Abrindo nova aba!");
    }

    public void displayPage(String url) {
        checkConnection();
        System.out.println("Acessando: " + url);
    }

    private void checkConnection() {
        System.out.println("Verificando conexão com a internet!");
    }
}
