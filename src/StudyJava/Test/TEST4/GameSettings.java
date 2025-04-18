package StudyJava.Test.TEST4;

public class GameSettings {
    private static GameSettings instance = new GameSettings();

    private String gameName;
    private String version;
    private int maxPlayers;


    private GameSettings() {}
    public static GameSettings getInstance() { return instance;}

    public String getGameName() { return gameName;}
    public String getVersion() { return version; }
    public int getMaxPlayers() { return maxPlayers; }

    public void settGameName(String gameName) { this.gameName = gameName; }
    public void setVersion(String version) { this.version = version; }
    public void setMaxPlayers(int maxPlayers) { this.maxPlayers = maxPlayers; }
}

