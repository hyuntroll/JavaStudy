package StudyJava.Test.TEST5;

public class HomeConfig {
    private static HomeConfig instance = new HomeConfig();
    private HomeConfig() {}
    public static HomeConfig getInstance() { return instance;}

    // field
    private String ownerName;
    private String homeVersion;
    private static int deviceLimit;

    public void setowName(String ownerName) { this.ownerName = ownerName; }
    public void sethomeVr(String homeVersion) { this.homeVersion = homeVersion; }
    public static void setdeLimit(int deLimit) { deviceLimit = deLimit; }

    public String getowName() { return ownerName; }
    public String gethomeVr() { return homeVersion; }
    public static int getdeLimit() { return deviceLimit; }


}
