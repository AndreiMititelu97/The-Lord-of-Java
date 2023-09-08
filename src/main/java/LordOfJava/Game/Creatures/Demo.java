package LordOfJava.Game.Creatures;

import LordOfJava.Game.Creatures.Abilities.Dragon;

public class Demo {
    public static void main(String[] args){
        LordOfJava lordOfJava = new LordOfJava("Mac OS", "./username", "strongPassword2021", 3);

        Dragon dragon81 = new Dragon(25, 100, 15, "master_dragon1", 80, 20, 40);
        Dragon dragon82 = new Dragon(35, 76, 5, "master_dragon2", 100, 20, 40);

        Warg warg81 = new Warg(25, 100, 15, "master_warg1", 85, 20);
        Warg warg82 = new Warg(80, 56, 23, "master_warg1", 85, 20);

        Mumakil mumakil81 = new Mumakil(25, 100, 15, "master_muma", 60);

        lordOfJava.addCreature(dragon81, "25,25");
        lordOfJava.addCreature(dragon82, "14,24");
        lordOfJava.addCreature(warg81, "12,27");
        lordOfJava.addCreature(warg82, "05,15");
        lordOfJava.addCreature(mumakil81, "01,01");

        System.out.println("Battle result: " + lordOfJava.battleDragonsWargs());
        System.out.println("Creatures:\n" + lordOfJava);
    }
}
