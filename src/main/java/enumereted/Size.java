package enumereted;

public enum Size {
    SMALL, MEDIUM(10), BIG(20);
    int maxWeight;

    Size() {
        System.out.println("Calling  constructor without args");
    }

    Size(int maxWeight) {
        this.maxWeight = maxWeight;
        System.out.println("Calling constructor with one args");
    }

    public int getMaxWeight(int maxWeight) {
        return maxWeight + 2;
    }

}
