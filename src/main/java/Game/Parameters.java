package Game;

public class Parameters {
    private String OS; // Operating system
    private String gamePATH; // Path to game location
    private String credentials; // User credentials
    private int noLives; // Number of lives of the user

    public Parameters(String OS, String gamePATH, String credentials, int noLives){
        this.OS = OS;
        this.gamePATH = gamePATH;
        this.credentials = credentials;
        this.noLives = noLives;
    }

    public String getOS(){
        return OS;
    }

    public String getGamePATH(){
        return gamePATH;
    }

    public String getCredentials(){
        return credentials;
    }

    public int getNoLives(){
        return noLives;
    }

    @Override
    public String toString(){
        return String.format("OS: %s\n" +
                "Game Path: %s\n" +
                "Credentials: %s\n" +
                "No. lives remaining: %d", OS, gamePATH, credentials, noLives);
    }
}
