package fruits;

public abstract class Fruit implements WeightProvider, Comparable<Fruit> {
    protected Integer weight;

    public Fruit(Integer weight) {
        this.weight = weight;
    }
    // comparing the weight of two fruits
    @Override
    public int compareTo(Fruit o){
        return this.weight - o.weight;
    }
}
