package StudyJava.Test.TEST3;

public class ConfigManager {
    private static ConfigManager instance = new ConfigManager();

    public String gameName;
    public String gameVersion;
    public int userCount;

    private ConfigManager() {}

    public static ConfigManager getInstance() {return instance;}
}
