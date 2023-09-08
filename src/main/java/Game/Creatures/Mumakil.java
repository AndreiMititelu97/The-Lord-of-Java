package Game.Creatures;

public class Mumakil extends Creature {
    public Mumakil(double stamina, double speed, int agility, String nickname, long score){
        super(stamina, speed, agility, nickname, score);
    }

    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility){
        this.getAbilities().update(0.75 * newStamina, 10 + newSpeed, newAgility);
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "\n" +
                "A creature of type Mumakil.");
    }
}
