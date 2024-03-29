package HW6;

public class Plant implements StringSerializable {

    private String name;
    private String type;
    private int quantity;

    public Plant() {
    }

    public Plant(String name, String type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Plant {name=" + name + ", type=" + type + ", quantity=" + quantity + "}";
    }

    public String toSerializableText() {
        return name + " " + type + " " + quantity;
    }
}
