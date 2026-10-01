public class Weapon extends Item {
    private int strength;
    private String type;
    private String name;

    public Weapon(int strength, String type, String name, int value) {
        super(value);
        this.strength = strength;
        this.type = type;
        this.name = name;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }
}