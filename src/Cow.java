public class Cow extends Animal{
    public Cow(int weight, int age, Gender gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public void eat() {
        System.out.println("Cow can't eat plants");
    }

    @Override
    public String toString() {
        return  "Cow" + super.toString();
    }
}
