package apps.music;

import actions.ActionsInterface;

public interface MusicPlayer extends ActionsInterface {
    public void player();
    public void pause();
    public void selectMusic(String musicName);    
    public void stop();
}
