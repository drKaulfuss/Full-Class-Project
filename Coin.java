public class Coin extends Item {
    private int money;

    public Coin(int money, int value) {
        super(value);
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }
}