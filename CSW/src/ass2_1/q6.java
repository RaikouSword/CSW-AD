package ass2_1;

public class q6 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion", "Yellow", "Wild");
        Animal animal2 = new Animal("Dog", "Brown", "Pet");
        Animal animal3 = new Animal("Elephant", "Grey", "Wild");
        Animal animal4 = new Animal("Cat", "White", "Pet");

        System.out.println("Hash Code of animal1: " + animal1.hashCode());
        System.out.println("Hash Code of animal2: " + animal2.hashCode());
        System.out.println("Hash Code of animal3: " + animal3.hashCode());
        System.out.println("Hash Code of animal4: " + animal4.hashCode());
    }
}

class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
