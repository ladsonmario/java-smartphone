package apps.telephone;

import actions.ActionsInterface;

public interface Telephone extends ActionsInterface {
    public void answer();
    public void startVoicemail();
    public void disconnect();
    public void call(String number);    
}
