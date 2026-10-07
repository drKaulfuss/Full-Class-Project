import java.util;

public class Boss extends NPC {
    public Boss(int strength, String dialogue, String name, int health){
        this.strength = strength;
        this.dialogue = dialogue;
        this.name = name;
        this.health = health;
    }
        public Boss(int a, int b, int c, int d){
        int[] strength = new int[20, 10, 15, 25, 12, 18];
        String[] dialogue = new String["WHAT?? You're not a feminist?? DIE", "Are you NOT a feminsist??? BECOME A SUSAN B ANTHONY!!", "Are you running away? Or is it just your hairline? (i can't tell the difference)","your double chin is showing", "I bench 500 pounds, i think ur around there", "girls rule and boys drool", "girls go to college to get more knowledge and boys go to jupiter to get stupider" ];
        String[] name = new String["Baddiella", "Im a Bad Btch", "SLAYQUEEN","im a feminist and yo not?","Baddiellina", "Baddietta", "anthony(we dont talk abt him)"];
        int[] health = new int[50,55,60,20,45,15,40];

        this.strength = strength[a];
        this.dialogue = dialogue[b];
        this.name = name[c];
        this.health = health[d];
    }
    public Boss(){
        this.strength = 30;
        this.dialogue = "Wow, way to go, just another man to take away a womans right", "I KNOW u didnt pay property tax on MY oubliette!";
        this.name = "Artemis";
        this.health = 120;

    }
    public int getStrength(){
        return this.strength;
    }
    public String getDialogue(){
        return this.dialogue;
    }
    public String getName(){
        return this.baddieName;
    }
    public int getHealth(){
        return this.health;
    }



}