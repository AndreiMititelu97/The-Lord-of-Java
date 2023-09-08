package Game.Creatures;

import Game.Creatures.Abilities.Abilities;
import Game.Creatures.Abilities.ICreature;

abstract public class Creature implements ICreature, Comparable<Creature> {
    private Abilities abilities; // Stats for a creature: Stamina, Speed and Agility
    private String nickname; // Nickname of the creature
    private long score; //Score of the creature

    public Creature(double stamina, double speed, int agility, String nickname, long score){
        this.abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }

    public Abilities getAbilities(){
        return abilities;
    }
    @Override
    public String getNickname(){
        return nickname;
    }

    public long getScore(){
        return score;
    }
    @Override
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    @Override
    public void updateScore(long amount) throws NumberFormatException{
        if(amount < 0){
            throw new NumberFormatException("Expecting positive bonus value, got:" + amount);
        }
        this.score += amount;
    }
    @Override
    public void powerUp(double stamina, double speed, int agility){
        abilities.update(stamina, speed, agility);
    }

    @Override
    public int compareTo(Creature other){
        return this.abilities.compareTo(other.abilities);
    }



    @Override
    public String toString(){
        return String.format("Nickname: %s\n" +
                "Score: %d\n" +
                "Abilities: %s", nickname, score, abilities);
    }
}
