public class Horse extends Animal{

    private Color color;

    public Horse(int weight, int age, Gender gender, String nickName, Color color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("Horse never eat plants from the street");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
