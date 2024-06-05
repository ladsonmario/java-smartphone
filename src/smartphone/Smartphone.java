package smartphone;

import apps.browser.GoogleChrome;
import apps.browser.InternetBrowser;
import apps.music.MusicPlayer;
import apps.music.Spotify;
import apps.telephone.GoogleContact;
import apps.telephone.Telephone;

public class Smartphone {
    public static void main(String[] args) {
        InternetBrowser googleChrome = new GoogleChrome();
        MusicPlayer spotify = new Spotify();
        Telephone googleContact = new GoogleContact();

        spotify.openApp(spotify.getAppName());
        spotify.selectMusic("Jet - Look What You've Done");
        spotify.player();

        googleChrome.openApp(googleChrome.getAppName());
        googleChrome.displayPage("https://www.facebook.com");
        googleChrome.openNewTab();
        googleChrome.displayPage("https://www.instagram.com");

        spotify.selectMusic("Nada Snurf - Inside of Love");
        spotify.player();

        googleContact.openApp(googleContact.getAppName());
        googleContact.call("+5591999999999");

        spotify.pause();

        googleContact.startVoicemail();
        googleContact.disconnect();

        spotify.player();

        googleContact.call("+5591988888888");

        spotify.pause();

        googleContact.answer();
        googleContact.disconnect();

        googleContact.closeApp(googleContact.getAppName());

        spotify.player();

        //a mimi

        spotify.stop();
        spotify.closeApp(spotify.getAppName());

        googleChrome.closeApp(googleChrome.getAppName());
    }
}
