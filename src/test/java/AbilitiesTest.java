import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Andrei.Abilities;

@DisplayName("Test Abilities class")
public class AbilitiesTest {
    private final double stamina = 10.1;
    private final double speed = 5.7777;
    private final int agility = 22;

    @Test
    void testConstructor(){
        Abilities abilities = new Abilities(stamina, speed, agility);
        assertEquals(stamina, abilities.getStamina());
        assertEquals(speed, abilities.getSpeed());
        assertEquals(agility, abilities.getAgility());
    }

    @Test
    void testToString(){
        Abilities abilities = new Abilities(stamina, speed, agility);
        String toStringRef = String.format("Player has a power of: %.0f, the speed: %.0f and the agility: %d.", stamina, speed, agility);
        assertEquals(toStringRef, abilities.toString());
    }

    @Test
    void testUpdate(){
        double stamina = 1;
        double speed = 2;
        int agility = 3;
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        abilities.update(stamina, speed, agility);

        assertEquals(stamina + this.stamina, abilities.getStamina());
        assertEquals(speed + this.speed, abilities.getSpeed());
        assertEquals(agility + this.agility, abilities.getAgility());
    }

    @Test
    void testCompareToBiggerStamina(){
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        Abilities other = new Abilities(stamina + 1, speed, agility);
        assertEquals(-1, abilities.compareTo(other));
    }

    @Test
    void testCompareToLowerStamina(){
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        Abilities other = new Abilities(stamina - 1, speed, agility);
        assertEquals(1, abilities.compareTo(other));
    }

    @Test
    void testCompareToBiggerSpeed(){
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        Abilities other = new Abilities(stamina, speed + 1, agility);
        assertEquals(-1, abilities.compareTo(other));
    }

    @Test
    void testCompareToLowerSpeed(){
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        Abilities other = new Abilities(stamina, speed - 1, agility);
        assertEquals(1, abilities.compareTo(other));
    }

    @Test
    void testCompareToBiggerAgility(){
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        Abilities other = new Abilities(stamina, speed, agility + 1);
        assertEquals(-1, abilities.compareTo(other));
    }

    @Test
    void testCompareToLowerAgility(){
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        Abilities other = new Abilities(stamina, speed, agility - 1);
        assertEquals(1, abilities.compareTo(other));
    }

    @Test
    void testCompareToLowerEquals(){
        Abilities abilities = new Abilities(this.stamina, this.speed, this.agility);
        Abilities other = new Abilities(stamina, speed, agility);
        assertEquals(0, abilities.compareTo(other));
    }
}
