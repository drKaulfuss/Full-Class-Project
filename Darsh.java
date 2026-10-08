public class Darsh extends NPC {

    public String[] darshDialogue = new String[]{
        "Aughh Aughh, your honor is TOO Low do NOT save me. Hit planet fitness", 
        "You are really honorable! I would LOVE to get saved by you.",
        "You are so auraful so much better than daivik",
        "Are you my savior?"
    };

    public Darsh (String n, String g, String[] dia) {
        this(n, g, 5, 5, 100, dia);
    }

    public Darsh (String n, String g, int st, int sp, int hp, String[] dia) {
        super(n, g, st, sp, hp, dia);
    }

    public void reevaluateSavability(Player p) {
        /* TODO:
        Conditions for Darsh being saved are
        - All bosses defeated
        - 5 missions completed 
        There should be ways to measure these*/
    }

    public void tryToSave(Player p) {
        if (!canBeSaved) {
            System.out.println("Looks like Darsh can't be saved yet!");
        }
        speak(3);

        if (p.getHonor() <= 6 ){
            speak(0);
        } else if (p.getHonor() > 6 && p.getHonor() <= 14){
            speak(1);
        } else if (p.getHonor() > 14) {
            speak(2);
        }
        
    }

    public boolean isSaved = false;
    public boolean canBeSaved = false;
}