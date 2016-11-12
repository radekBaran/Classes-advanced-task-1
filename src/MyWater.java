import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyWater {

    private static Size size;
    private static Map<Size, Integer> bottles = new HashMap<Size, Integer>();

    Scanner input = new Scanner(System.in);

    public void addLarge(int l) {
        size = Size.LARGE;
        bottles.put(size, l);
    }

    public void addMedium(int m) {
        size = Size.MEDIUM;
        bottles.put(size, m);
    }

    public void addSmall(int s) {
        size = Size.SMALL;
        bottles.put(size, s);
    }

    public void printInfo(){
        System.out.println("Mamy teraz " + addWater() + " litrów wody");
        for(Size key : bottles.keySet()){
            System.out.println(key + " " + bottles.get(key));
        }
    }

    public double addWater(){
        double large = 2;
        double medium = 1;
        double small = 0.5;
        double sum  = (small * bottles.getOrDefault(Size.SMALL, 0)) + (medium * bottles.getOrDefault(Size.MEDIUM, 0)) +
                (large * bottles.getOrDefault(Size.LARGE, 0));

        return sum;
    }

    public void loadData(){
        System.out.println("Wprowadź liczbę dużych butelek: ");
        addLarge(input.nextInt());
        System.out.println("Wprowadź liczbę średnich butelek: ");
        addMedium(input.nextInt());
        System.out.println("Wprowadź liczbę małych butelek: ");
        addSmall(input.nextInt());
    }
}
