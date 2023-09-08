package Game;

import Game.Creatures.Abilities.Dragon;
import Game.Creatures.Creature;
import Game.Creatures.Mumakil;
import Game.Creatures.Warg;

import java.util.ArrayList;

public class LordOfJava {
    private Parameters parameters;
    private Cohort<Dragon> dragons;
    private Cohort<Warg> wargs;
    private Cohort<Mumakil> mumakils;

    public LordOfJava(String OS, String gamePATH, String credentials, int noLives){
        parameters = new Parameters(OS, gamePATH, credentials, noLives);
        dragons = new Cohort<>();
        wargs = new Cohort<>();
        mumakils = new Cohort<>();
    }

    public void addCreature(Creature creature, String address){
        if (creature instanceof Dragon){
            dragons.addNewCitizen(address, (Dragon) creature);
        } else if (creature instanceof Warg){
            wargs.addNewCitizen(address, (Warg) creature);
        } else if (creature instanceof Mumakil){
            mumakils.addNewCitizen(address, (Mumakil) creature);
        } else {
            throw new IllegalArgumentException("Creature type unknown:" + creature.getClass().getName());
        }
    }

    public int battleDragonsWargs(){
        int totalPoints = 0;

        if(dragons.getSize() > wargs.getSize()){
            return 1;
        } else if (dragons.getSize() < wargs.getSize()){
            return -1;
        } else {
            ArrayList<Dragon> dragonFighters = dragons.getAllCitizensToFight();
            ArrayList<Warg> wargFighters = wargs.getAllCitizensToFight();

            for(int i = 0; i < dragonFighters.size(); i++){
                int fight = dragonFighters.get(i).compareTo(wargFighters.get(i));
                if(fight > 0){
                    totalPoints++;
                } else {
                    totalPoints--;
                }
            }
        }

        if(totalPoints > 0){
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString(){
        return String.format(parameters + "\n\n" +
                dragons + "\n" +
                wargs + "\n" +
                mumakils);
    }
}
