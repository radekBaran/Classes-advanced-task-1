import java.util.HashMap;
import java.util.Map;

public class MyWater {

    private static Size size;
    private static Map<Size, Integer> bottles = new HashMap<Size, Integer>();

    public void addLarge(int l) {
        size = Size.LARGE;
        bottles.put(Size.LARGE, l);
    }

    public void printInfo(){
        for(Size key : bottles.keySet()){
            System.out.println(key + " " + bottles.get(key));
        }
    }
}
