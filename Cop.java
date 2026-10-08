import java.util.;
public class Cop extends NPC { 

  private boolean isGoodCop;
  public Cop (String name, String gender, int str, int spd, int hp) {
    super(name, gender, str, spd, hp,
      new String[]{
        "Morning! Looking good out there today.", // Good cop lines
        "Hey there! Looking sharp as always.",
        "Good to see you! Hope your day's off to a great start.",
        "Well, good morning! You're looking mighty cheerful today.",
        "Hey, neighbor! Looking like today's treating you well.",
        "Good afternoon! Nice to see a friendly face around here.",
        "Looking sharp, citizen! Keep it up.",
        "Hey there! That's the kind of smile this town needs.",
        "Good seeing you out and about today. Looking great!",
        "Morning! Hope the rest of the day is as bright as you seem.",
        "Well, well. Looks like someone's carrying today's bonus.", // Bad Cop Lines
        "You know, I could probably find a violation if I looked hard enough.",
        "That's a nice wallet you've got there. Be a shame if I needed to inspect it.",
        "Funny thing about the law. It gets expensive when I'm involved.",
        "You got permit money, or paperwork trouble?",
        "I'm sure we can settle this... for the right price.",
        "Everyone's guilty of something. The question is how much it's worth to forget.",
        "You don't look like trouble. You look like profit.",
        "Let's make this quick. I've got quotas to meet and pockets to fill.",
        "I saw nothing... assuming I continue seeing nothing.",
        "Go ahead. Give me an excuse.", // Agressive cop lines
        "I've dealt with tougher than you before breakfast.",
        "You're real close to making today interesting.",
        "Keep talking. See where it gets you.",
        "Something tells me you're about to make a bad decision.",
        "I'm having a rough day. Don't make it your problem.",
        "You should walk away while I'm still feeling generous.",
        "I've got my eye on you, and I don't blink often.",
        "Careful. My patience clock just hit zero.",
        "You wanna push your luck? Let's find out how much you have."
      }
  );
    this.isGoodCop = (Math.random >= 0.4);
  }
  public void checkHonor(Player player) {
    if (!isGoodCop) {
        this.speak((int)(Math.random() * 10) + 10);
        fight(player);
    } else if (player.getHonor() >= 12) {
        this.speak((int)(Math.random() * 10));
    } else if (player.getHonor() >= 8 && player.getHonor() < 12) {
        this.speak((int)(Math.random() * 10) + 20);
    } else {
        this.speak((int)(Math.random() * 10) + 10);
        fight(player);
    }
  }  

  public void fight(Player player) {
      // whatever combat logic is supposed to happen
      // e.g. reduce player's HP, damage, etc.
  }
}
