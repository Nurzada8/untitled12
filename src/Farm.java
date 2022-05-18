import java.util.Arrays;

public class Farm  {
    private String address;
    private Cow [] cows;
    private Horse [] horses;
    private Sheep [] sheep;
   private String Owner;

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String owner) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        Owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "address='" + address + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", horses=" + Arrays.toString(horses) +
                ", sheep=" + Arrays.toString(sheep) +
                ", Owner='" + Owner + '\'' +
                '}';
    }
}
