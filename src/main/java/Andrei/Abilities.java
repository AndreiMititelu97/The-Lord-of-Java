package Andrei;

public class Abilities implements Comparable<Abilities>{
    private double stamina;
    private double speed;
    private int agility;

    public Abilities(double stamina, double speed, int agility){
        this.stamina = stamina;
        this.speed = speed;
        this.agility = agility;
    }

    @Override
    public int compareTo(Abilities other){
        if (this.stamina > other.stamina){
            return 1;
        } else if (this.stamina < other.stamina){
            return -1;
        }

        else {
            if (this.speed > other.speed){
                return 1;
            } else if (this.speed < other.speed){
                return -1;
            }

            else {
                if(this.agility > other.agility) {
                    return 1;
                } else if (this.agility < other.agility){
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    void update(double stamina, double speed, int agility){
        this.stamina += stamina;
        this.speed += speed;
        this.agility += agility;
    }

    @Override
    public String toString(){
        return String.format("Player has a power of: %.0f, the speed: %.0f and the agility: %d.", stamina, speed, agility);
    }
}
