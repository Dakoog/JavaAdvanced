package enumereted;

public enum Size {
    SMALL, MEDIUM(10), BIG(20);
    int maxWeight;

    Size() {
        System.out.println("Calling  constructor without args:  ");
    }

    Size(int maxWeight) {
        this.maxWeight = maxWeight;
        System.out.printf("Calling constructor with one args: %s %n", maxWeight);
    }

    public int getMaxWeight() {
        return (maxWeight + 2);
    }

}
