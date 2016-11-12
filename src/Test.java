public class Test {
    public static void main(String[] args) {
        MyWater myWater = new MyWater();

        myWater.addLarge(6);
        myWater.addSmall(5);
        myWater.addMedium(2);


        myWater.printInfo();
    }
}
