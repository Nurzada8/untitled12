public abstract class Animal {

   private int weight;
   private int age;
   private Gender gender;
   private String nickName;

    public Animal(int weight, int age, Gender gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
    public abstract void eat();

    @Override
    public String toString() {
        return "{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
