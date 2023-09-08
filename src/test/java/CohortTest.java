import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.ArrayList;
import Andrei.Creatures.Abilities.Dragon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Andrei.Cohort;

@DisplayName("Test Cohort class")
public class CohortTest {

    private Dragon dragon1;
    private Dragon dragon2;
    private Dragon dragon3;
    private Cohort<Dragon> cohortDragon1;
    @BeforeEach
    void createCreatures(){
        dragon1 = new Dragon(5,1,2,"Dragon1", 1, 1, 1);
        dragon2 = new Dragon(3,1,2,"Dragon2", 1, 1, 1);
        dragon3 = new Dragon(7,1,2,"Dragon3", 1, 1, 1);
        cohortDragon1 = new Cohort<>();
    }

    @Test
    void testAddAndReturn(){
        cohortDragon1.addNewCitizen("1", dragon1);
        assertEquals(dragon1, cohortDragon1.getCitizenAt("1"));
    }

    @Test
    void testIsEmpty(){
        assertTrue(cohortDragon1.isEmpty());
        cohortDragon1.addNewCitizen("1", dragon1);
        assertFalse(cohortDragon1.isEmpty());
    }

    @Test
    void testGetSize(){
        assertEquals(0, cohortDragon1.getSize());
        cohortDragon1.addNewCitizen("1", dragon1);
        assertEquals(1, cohortDragon1.getSize());
    }

    @Test
    void testGetCitizenAt(){
        cohortDragon1.addNewCitizen("1", dragon1);
        assertEquals(dragon1, cohortDragon1.getCitizenAt("1"));
    }

    @Test
    void testGetAllCitizensToFight(){
        cohortDragon1.addNewCitizen("1", dragon1);
        cohortDragon1.addNewCitizen("2", dragon2);
        cohortDragon1.addNewCitizen("3", dragon3);
        ArrayList<Dragon> arrayList = cohortDragon1.getAllCitizensToFight();

        ArrayList<Dragon> ref = new ArrayList<>();
        ref.add(dragon2);
        ref.add(dragon1);
        ref.add(dragon3);

        assertEquals(ref, arrayList);
    }
}
