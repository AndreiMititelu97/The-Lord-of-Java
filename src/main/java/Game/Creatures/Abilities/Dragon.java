package Game.Creatures.Abilities;

import Game.Creatures.Creature;

public class Dragon extends Creature implements IBurn {
    private double flamesPower;
    private int flySpeed;

    public Dragon(double stamina, double speed, int agility, String nickname, long score, double flamesPower, int flySpeed){
        super(stamina, speed, agility, nickname, score);
        this.flamesPower = flamesPower;
        this.flySpeed = flySpeed;
    }

    @Override
    public double getFlamesPower(){
        return flamesPower;
    }

    @Override
    public int getFlyingSpeed(){
        return flySpeed;
    }

    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility){
        this.getAbilities().update(2 * newStamina, newSpeed / 2, 3 * newAgility);
    }

    @Override
    public String toString(){
        return String.format(super.toString() + "\n" +
                "Flames power: %.1f\n" +
                "Fly speed: %d", flamesPower, flySpeed);
    }
}
