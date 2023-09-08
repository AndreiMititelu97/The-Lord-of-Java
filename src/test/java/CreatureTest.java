import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Andrei.Dragon;
import Andrei.Warg;
import Andrei.Mumakil;

@DisplayName("Test Creature class")
public class CreatureTest {
    private final double stamina = 11.1;
    private final double speed = 10;
    private final int agility = 5;
    private final String nickname = "TestName";
    private final long score = 1000;
    private final double flamesPower = 5.5;
    private final int flySpeed = 1;
    private final double bitePower = 1;

    // Test Creature fields
    @Test
    void testCreature(){
        Dragon dragon = new Dragon(stamina, speed, agility, nickname, score,flamesPower, flySpeed);
        assertEquals(nickname, dragon.getNickname());
        assertEquals(score, dragon.getScore());
    }

    //Test Dragon constructor and fields
    @Test
    void testCreatureDragon(){
        Dragon dragon = new Dragon(stamina, speed, agility, nickname, score,flamesPower, flySpeed);
        assertEquals(nickname, dragon.getNickname());
        assertEquals(score, dragon.getScore());

        assertEquals(flamesPower, dragon.getFlamesPower());
        assertEquals(flySpeed, dragon.getFlyingSpeed());
    }

    @Test
    void testDragonPowerUp(){
        Dragon dragon = new Dragon(stamina, speed, agility, nickname, score,flamesPower, flySpeed);
        dragon.powerUp(1, 2, 1);
        assertEquals(stamina + 2, dragon.getAbilities().getStamina());
        assertEquals(speed + 1, dragon.getAbilities().getSpeed());
        assertEquals(agility + 3, dragon.getAbilities().getAgility());
    }

    @Test
    void testWargPowerUp(){
        Warg warg = new Warg(stamina, speed, agility, nickname, score, bitePower);
        warg.powerUp(2, 1, 1);
        assertEquals(stamina + 1, warg.getAbilities().getStamina());
        assertEquals(speed + 4, warg.getAbilities().getSpeed());
        assertEquals(agility + 1, warg.getAbilities().getAgility());
    }

    @Test
    void testMumakilPowerUp(){
        Mumakil mumakil = new Mumakil(stamina, speed, agility, nickname, score);
        mumakil.powerUp(1, 1, 1);
        assertEquals(stamina + 0.75d, mumakil.getAbilities().getStamina());
        assertEquals(speed + 11, mumakil.getAbilities().getSpeed());
        assertEquals(agility + 1, mumakil.getAbilities().getAgility());
    }



}

