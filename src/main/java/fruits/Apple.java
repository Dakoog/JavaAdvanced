package fruits;

public class Apple extends Fruit{

    public Apple(Integer weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        System.out.print("The weight this apple it: ");
        return weight;
    }

    @Override
    public String toString() {
        return "Apple weight:" + Integer.toString(weight);
    }
}
