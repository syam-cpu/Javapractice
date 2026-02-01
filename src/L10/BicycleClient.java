package L10;

public class BicycleClient {

    public static void main(String[] args) {
        Bicycle sportsBicycle =  new Bicycle();

        System.out.println(sportsBicycle.gear);
        sportsBicycle.braking();


        Bicycle touringBicycle = new Bicycle();

        System.out.println(touringBicycle.gear);
        touringBicycle.braking();
    }
}
