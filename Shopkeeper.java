import java.util.ArrayList;

public class Shopkeeper extends NPC {

    public void getItems() {
        for (Item i : this.itemsForSale) {
            System.out.println(i.name + " - " + (i.cost * this.priceMult));
        }

    }

    public void sellItem(Player p, int i) {
        p.setMoney(p.getMoney() - (this.itemsForSale.get(i) * this.priceMult));
    }

    public void buyItem(Player p, int i) {
        p.setMoney(p.getMoney() + p.getInventory(i).cost);
        p.removeInventory(i);
    }

    private ArrayList<Item> itemsForSale;
    private double priceMult;

} 

