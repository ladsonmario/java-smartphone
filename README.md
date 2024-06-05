## UML

```plantuml
@startuml
package smartphone {
    class Smartphone {
        + main(args: String[])
    }
}

package apps.browser {
    class InternetBrowser {
        + openApp(appName: String)
        + displayPage(url: String)
        + openNewTab()
        + closeApp(appName: String)
        + getAppName(): String
    }

    class GoogleChrome {
    }
    
    InternetBrowser <|-- GoogleChrome
}

package apps.music {
    class MusicPlayer {
        + openApp(appName: String)
        + selectMusic(music: String)
        + player()
        + pause()
        + stop()
        + closeApp(appName: String)
        + getAppName(): String
    }

    class Spotify {
    }
    
    MusicPlayer <|-- Spotify
}

package apps.telephone {
    class Telephone {
        + openApp(appName: String)
        + call(number: String)
        + startVoicemail()
        + disconnect()
        + answer()
        + closeApp(appName: String)
        + getAppName(): String
    }

    class GoogleContact {
    }
    
    Telephone <|-- GoogleContact
}

Smartphone ..> GoogleChrome
Smartphone ..> Spotify
Smartphone ..> GoogleContact
@enduml