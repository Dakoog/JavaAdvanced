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
    public int getWeight() {
        return content.getWeight() + 1;
    }
}
