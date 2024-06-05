package apps.music;

import actions.Actions;

public class Spotify extends Actions implements MusicPlayer {
    private String appName = "Spotify";
    private String musicSelected;

    public String getAppName() {
        return appName;
    }

    public void player() {
        System.out.println("Tocando " + musicSelected);
    }

    public void pause() {
        System.out.println("Música pausada!");
    }

    public void stop() {
        System.out.println("Música parada!");
        musicSelected = "";
    }

    public void selectMusic(String musicName) {
        System.out.println("Música: " + musicName + " selecionada!");
        musicSelected = musicName;
    }
}
