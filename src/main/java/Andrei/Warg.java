package Andrei;

public class Warg extends Creature implements IBite {
    private double bitePower;

    public Warg(double stamina, double speed, int agility, String nickname, long score, double bitePwer){
        super(stamina, speed, agility, nickname, score);
        this.bitePower = bitePower;
    }

    @Override
    public double getBitePower(){
        return bitePower;
    }

    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility){
        this.getAbilities().update(newStamina / 2, 4 * newSpeed, newAgility);
    }

    @Override
    public String toString(){
        return String.format(super.toString() +
                "Bite power: %f", bitePower);
    }


}