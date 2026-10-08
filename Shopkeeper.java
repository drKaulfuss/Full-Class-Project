public class Shopkeeper extends NPC {

    public String[] shopkeeperDialogue = new String[]{
        "Hello! Welcome to my shop! Would you like anything?",
        "Here's what I've got!",
        "Thank you for your purchase! Want something else?",
        "Want anything else?",
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
        p.setMoney(p.getMoney() - (int)(this.itemsForSale[i].getValue() * this.priceMult));
    }

    public void buyItem(Player p, int i) {
        p.setMoney(p.getMoney() + p.getInv()[i].getValue());
        p.removeFromInv(i);
    }

    private Item[] itemsForSale;
    private double priceMult;

    

} 

