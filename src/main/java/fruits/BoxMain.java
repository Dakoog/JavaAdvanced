package fruits;



public class BoxMain {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(10));

        Box<Box<Apple>> appleContainer = new Box<>(appleBox);
        // the apple comes in two boxes that weigh 1 gram each
        int weight = appleContainer.getWeight();

        System.out.println(weight);
    }
}
