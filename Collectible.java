public class Collectible extends Item {
    private String name;

    public Collectible(String name, int value) {
        super(value);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}