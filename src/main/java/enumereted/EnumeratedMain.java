package enumereted;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumeratedMain {
    public static void main(String[] args) {
        // colors
        Color red = Color.RED;// instance for color red
        String colorName = red.name();
        System.out.println(colorName);//RED
        int ordinal = Color.GREEN.ordinal(); // checking, which is green in order

        Color grassColor = Color.valueOf("GREEN");
        Color skyColor = Color.valueOf("BLUE");
        Color communistColor = Color.valueOf("RED");

        String colorSky = skyColor.toString().toLowerCase();
        System.out.println(grassColor + " it color of grass");
        System.out.println(colorSky + " it color of sky");
        System.out.println(communistColor + " it color of communist");

        List<String> technicColors = List.of(Arrays.toString(Color.values()).toLowerCase());
        System.out.println("The available colors are : " + technicColors);
        // sizes
        Size smallOne = Size.SMALL;
        Size smallTwo = Size.SMALL; // these two reference show the same object
        Size medium = Size.MEDIUM;
        Size big = Size.BIG;
        System.out.println("Big pizza weight " + big.maxWeight + "dag, big pizza but in a box weight " + big.getMaxWeight() + "dag.");
        float addResults = Operation.ADD.calculate(1, 3);
        float subResults = Operation.SUBTRACT.calculate(1, 3);
        float multiResults = Operation.MULTIPLY.calculate(1, 3);
        float divResults = Operation.DIVIDE.calculate(1, 3);
        System.out.println("1 + 3 = " + addResults);
        System.out.println("1 - 3 = " + subResults);
        System.out.println("1 * 3 = " + multiResults);
        System.out.println("1 : 3 = " + divResults);

    }
}

