package Game;
import Game.Creatures.Creature;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Cohort<C extends Creature> {
    private HashMap<String, C> cohort;

    public Cohort(){
        cohort = new HashMap<>();
    }

    public int getSize(){
        return cohort.size();
    }

    public C getCitizenAt(String address){
        return cohort.get(address);
    }

    public boolean isEmpty(){
        return cohort.isEmpty();
    }

    public void addNewCitizen(String address, C creature){
        cohort.put(address, creature);
    }

    public ArrayList<C> getAllCitizensToFight(){
        ArrayList<C> creatures = new ArrayList<>(cohort.values());
        Collections.sort(creatures);

        return creatures;
    }

    @Override
    public String toString(){
        ArrayList<C> creatures = getAllCitizensToFight();
        StringBuilder creaturesToString = new StringBuilder();

        for(C creature : creatures){
            creaturesToString.append(creature.toString());
            creaturesToString.append("\n");
        }

        return creaturesToString.toString();
    }
}
