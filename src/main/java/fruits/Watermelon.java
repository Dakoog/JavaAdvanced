package fruits;

public class Watermelon extends Fruit{

    public Watermelon(Integer weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        System.out.print("The weight this watermelon it: ");
        return weight;
    }

    @Override
    public String toString() {
        return "Watermelon weight:" + Integer.toString(weight);
    }
}
