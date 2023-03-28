public class Runner {

    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle(100);
        System.out.println("Initial volume: " + waterBottle.getVolume());
        waterBottle.drink();
        System.out.println("After drink volume: " + waterBottle.getVolume());
        waterBottle.empty();
        System.out.println("After empty volume: " +waterBottle.getVolume());
        waterBottle.fill();
        System.out.println("After fill volume: " +waterBottle.getVolume());
    }
}
