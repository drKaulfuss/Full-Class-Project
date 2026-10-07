public class Coin extends Item {

    public Coin(int value) {
        super(value);
    }

    public int getMoney() {
        return this.getValue();
    }

    public void setMoney(int n) {
        this.setValue(n);
    }
}