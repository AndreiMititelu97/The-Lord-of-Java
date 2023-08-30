import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Andrei.Parameters;
@DisplayName("Test Parameter class")
public class ParametersTest {

    @Test
    void testConstructor(){
        Parameters parameters = new Parameters("myOS", "myPath", "admin", 1);
    }

    @Test
    void testToString(){
        Parameters parameters = new Parameters("myOS", "myPath", "admin", 1);
        String parametersToString = parameters.toString();
        String refToString = "OS: myOS\n" +
                "Game Path: myPath\n" +
                "Credentials: admin\n" +
                "No. lives remaining: 1";
        assertEquals(refToString, parametersToString);
    }
}
