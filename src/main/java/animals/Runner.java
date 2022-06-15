package animals;

public interface Runner {



    void run();// and public abstract (methods) is default
    default void count() {// the default method requires implementation in the interface, is inherited by classes
                         // that implement the Runner interface and can be overridden
        showPrivateCounting();
        run();                                  // wywołanie metody run() z klasy implementującej interfejs Runner
    }

    static void staticCount() {                 // static method requires implementation in the interface, cannot be overridden, can exit of object -> Runner.staticCount()
        showPrivateStaticCounting();
    }

    private void showPrivateCounting() {        // private method requires implementation in the interface,
        System.out.println("3, 2, 1...start!");
    }

    private static void showPrivateStaticCounting() {   // private static method requires implementation in the interface,
        System.out.println("3, 2, 1...start!");
    }

}
