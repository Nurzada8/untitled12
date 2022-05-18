public class Sheep extends Animal {
    public Sheep(int weight, int age, Gender gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public void eat() {
        System.out.println("Sheep can eat green plants");
    }

    @Override
    public String toString() {
        return "Sheep " + super.toString();
    }
}
