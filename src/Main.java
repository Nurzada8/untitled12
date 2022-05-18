public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow(7, 5, Gender.FEMALE, "cow");
        Cow cow2 = new Cow(7, 5, Gender.FEMALE, "Cow");
        Cow cow3 = new Cow(7, 5, Gender.FEMALE, "Cow");
        Cow cow4 = new Cow(7, 5, Gender.FEMALE, "Cow");
        Cow cow5 = new Cow(7, 5, Gender.FEMALE, "Cow");
        Cow cow6 = new Cow(7, 5, Gender.FEMALE, "Cow");

        Cow[] cows1 = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cows2 = {cow6};

        Sheep sheep1 = new Sheep(4, 7, Gender.FEMALE, "Sheep");
        Sheep sheep2 = new Sheep(4, 7, Gender.FEMALE, "Sheep");
        Sheep sheep3 = new Sheep(4, 7, Gender.FEMALE, "Sheep");
        Sheep sheep4 = new Sheep(4, 7, Gender.FEMALE, "Sheep");

        Sheep[] sheepes1 = {sheep1, sheep2, sheep3};
        Sheep[] sheepes2 = {sheep4};

        Horse horse1 = new Horse(8, 5, Gender.MALE, "Horse", Color.Black);
        Horse horse2 = new Horse(8, 5, Gender.MALE, "Horse", Color.Black);
        Horse horse3 = new Horse(8, 5, Gender.MALE, "Horse", Color.Black);

        Horse[] horses1 = {horse1, horse2};
        Horse[] horses2 = {horse3};

        Farm farm1 = new Farm("street 45", cows1, horses1, sheepes1, "Robbert");
        System.out.println(" Farm1" + farm1);


        Farm farm2 = new Farm("Street 65", cows2, horses2, sheepes2, "Sam");
        System.out.println(" Farm2" + farm2);
        System.out.println();

        horse1.eat();
        cow1.eat();
        sheep1.eat();

    }
}