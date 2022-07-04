package fruits;

public class Box<T extends WeightProvider> implements WeightProvider {
    private final T content;

    // constructor
    public Box(T content) { // a generic type can take both weightProvider objects and all inheriting classes
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    @Override
    // the weight of the fruit plus the weight of the box
    public int getWeight() {
        return content.getWeight() + 1;
    }
}
