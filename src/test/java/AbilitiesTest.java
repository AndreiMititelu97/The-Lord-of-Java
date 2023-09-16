import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import Game.Creatures.Abilities.Abilities;

@DisplayName("Test Abilities class")
public class AbilitiesTest {
    private final double stamina = 10.1;
    private final double speed = 5.7777;
    private final int agility = 22;
    private Abilities abilities;

    @BeforeEach
    void setUpAbilities(){
        abilities = new Abilities(stamina, speed, agility);
    }

    @Test
    void testConstructor(){
        assertEquals(stamina, abilities.getStamina());
        assertEquals(speed, abilities.getSpeed());
        assertEquals(agility, abilities.getAgility());
    }

    @Test
    void testUpdate(){
        double stamina = 1;
        double speed = 2;
        int agility = 3;
        abilities.update(stamina, speed, agility);

        assertEquals(stamina + this.stamina, abilities.getStamina());
        assertEquals(speed + this.speed, abilities.getSpeed());
        assertEquals(agility + this.agility, abilities.getAgility());
    }

    @Nested
    class compareToTest{
        private Abilities other;
        @BeforeEach
        void init(){
            other = new Abilities(stamina, speed, agility);
        }
        @Test
        void testLowerStamina(){
             other.update(1, 0, 0);
            assertEquals(-1, abilities.compareTo(other));
        }

        @Test
        void testBiggerStamina(){
            other.update(-1, 0, 0);
            assertEquals(1, abilities.compareTo(other));
        }

        @Test
        void testLowerSpeed(){
            other.update(0, 1, 0);
            assertEquals(-1, abilities.compareTo(other));
        }

        @Test
        void testBiggerSpeed(){
            other.update(0, -1, 0);
            assertEquals(1, abilities.compareTo(other));
        }

        @Test
        void testLowerAgility(){
            other.update(0, 0, 1);
            assertEquals(-1, abilities.compareTo(other));
        }

        @Test
        void testBiggerAgility(){
            other.update(0, 0, -1);
            assertEquals(1, abilities.compareTo(other));
        }

        @Test
        void testEqual(){
            other.update(0, 0, 0);
            assertEquals(0, abilities.compareTo(other));
        }
    }
}
