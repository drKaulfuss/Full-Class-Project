import java.util.*;

public class Player extends Character {
    private Item[] inventory = new Item[20];
    private int honor = 0;

    public Player (String n, String g) {
        super(n, g, 5, 5, 100);
        this.honor = 10;
    }

    public int getHonor () {
        return this.honor;
    }

    public void setHonor (int newVal) {
        this.honor = newVal;
    }

    public String toString () {
        return "Player " + super.toString() + String.format("\n  Honor: %d\n  Inventory: %s", this.honor, inventory.toString());
    }

    public int getMoney () {
        int totalMoney = 0;
        for (int i = 0; i < this.inventory.length; i++) {
            if (this.inventory[i] instanceof Coin) {
                totalMoney += this.inventory[i].getValue();
            }
        }
        return totalMoney;
    }

    /*public void setMoney (int newVal) {
        for (int i = 0; i < this.inventory.length; i++) {
            if (this.inventory[i] instanceof Coin) {
                this.inventory.remove(i);
                i--;
            }
        }

        this.inventory.add(new Coin(newVal));
    }*/

    public int getInvValue () {
        int totalValue = 0;

        for (Item i: this.inventory) {
            totalValue += i.getValue();
        }

        return totalValue;
    }

    public void removeFromInv (int index) {
        this.inventory[index] = null;
    }

    public Item[] getInv () {
        return this.inventory;
    }
}
