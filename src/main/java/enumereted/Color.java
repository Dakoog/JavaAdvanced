package enumereted;

public enum Color {
    // adding an abstract "sing" method for each color
    RED {
        @Override
        public void sing() {
            System.out.println("Red wine...");
        }
    },
    BLUE {
        @Override

        public void sing() {
            System.out.println("Blue velvet,... ");
        }
    },
    GREEN {
        @Override
        public void sing() {
            System.out.println("Zielono mi...");
        }
    };

    //an abstract method for Enum Color that adds popular songs containing that color
    /* this method is available for any value*/public abstract void sing();// WARNING! Each value have to provide its own implementation
}

