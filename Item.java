public class Item {
    private int value;
    private String name;

    public Item(int value) {
        value = this.value;
        name = "Item";
    }
    
    public Item (int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int v) {
        this.value = v;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}