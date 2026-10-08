public class Shopkeeper extends NPC {

    public String[] shopkeeperDialogue = new String[]{
        "Hello! Welcome to my shop! Would you like anything?",
        "Here's what I've got!",
        "Thank you for your purchase! Want something else?",
        "Want anything else?",
        "Hey, you don't have enough for that!",
        "You seem like a good person; I'll give you a discount!",
        "You seem kinda shady... I've gotta ask you to pay more for that.",
        "Looks like you're carrying a lotta stuff... I'll let you pay for it when you've got room!"
    };

    public Shopkeeper(String n, String g, int st, int sp, int hp, String[] dia) {
        super(n, g, st, sp, hp, dia);
        this.setDialogue(shopkeeperDialogue);
    }
    
    public void getItems() {
        for (Item i : this.itemsForSale) {
            System.out.println(i.getName() + " - " + (i.getValue() * this.priceMult));
        }

    }

    public void sellItem(Player p, int i) {
        Item myItem = itemsForSale[i];
        if (p.getMoney() > myItem.getValue()) {
            p.setMoney(p.getMoney() - (int)(myItem.getValue() * this.priceMult));
        } else {
            // TODO: Make the shopkeeper say that the player doesn't have enough
            return;
        }
        
    }

    public void buyItem(Player p, int i) {
        p.setMoney(p.getMoney() + p.getInv()[i].getValue());
        p.removeFromInv(i);
    }

    private Item[] itemsForSale;
    private double priceMult;

    

} 

