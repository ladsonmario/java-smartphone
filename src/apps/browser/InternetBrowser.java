package apps.browser;

import actions.ActionsInterface;

public interface InternetBrowser extends ActionsInterface {        
    public void reloadPage();
    public void openNewTab();
    public void displayPage(String url);
}
