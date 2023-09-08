package Game.Creatures.Abilities;

public class Abilities implements Comparable<Abilities>{
    private double stamina;
    private double speed;
    private int agility;

    public Abilities(double stamina, double speed, int agility){
        this.stamina = stamina;
        this.speed = speed;
        this.agility = agility;
    }

    public double getStamina(){
        return stamina;
    }

    public double getSpeed(){
        return speed;
    }

    public int getAgility(){
        return agility;
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

    public void update(double stamina, double speed, int agility){
        this.stamina += stamina;
        this.speed += speed;
        this.agility += agility;
    }

    public int powerDifferenceApprox(Abilities other){
        return (int)Math.abs(this.stamina - other.stamina);
    }

    @Override
    public String toString(){
        return String.format("Player has a power of: %.1f, the speed: %.1f and the agility: %d", stamina, speed, agility);
    }
}
