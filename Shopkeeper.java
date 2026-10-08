public class Shopkeeper extends NPC {

    public Shopkeeper(String n, String g, int st, int sp, int hp, String[] dia) {
        super(n, g, st, sp, hp, dia);
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

