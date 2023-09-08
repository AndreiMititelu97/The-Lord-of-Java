import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Game.Parameters;
@DisplayName("Test Parameter class")
public class ParametersTest {
    private final String os = "myOS";
    private final String gamePATH = "myPath";
    private final String credentials = "admin";
    private final int noLives = 1;
    private Parameters parameters;

    @BeforeEach
    void setUp(){
        parameters = new Parameters(os, gamePATH, credentials, noLives);
    }

    @Test
    void testConstructor(){
        assertEquals(os, parameters.getOS());
        assertEquals(gamePATH, parameters.getGamePATH());
        assertEquals(credentials, parameters.getCredentials());
        assertEquals(noLives, parameters.getNoLives());
    }
}
