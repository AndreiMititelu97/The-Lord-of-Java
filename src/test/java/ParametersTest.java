import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Andrei.Parameters;
@DisplayName("Test Parameter class")
public class ParametersTest {
    private final String os = "myOS";
    private final String gamePATH = "myPath";
    private final String credentials = "admin";
    private final int noLives = 1;

    @Test
    void testConstructor(){
        Parameters parameters = new Parameters(os, gamePATH, credentials, noLives);
        assertEquals(os, parameters.getOS());
        assertEquals(gamePATH, parameters.getGamePATH());
        assertEquals(credentials, parameters.getCredentials());
        assertEquals(noLives, parameters.getNoLives());
    }

    @Test
    void testToString(){
        Parameters parameters = new Parameters(os, gamePATH, credentials, noLives);
        String refToString = String.format("OS: %s\n" +
                "Game Path: %s\n" +
                "Credentials: %s\n" +
                "No. lives remaining: %d", os, gamePATH, credentials, noLives);

        assertEquals(refToString, parameters.toString());
    }
}
