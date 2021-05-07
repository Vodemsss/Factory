package pattetns;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory ();
        Tractor cat = factory.create("CAT");
        Tractor kamaz = factory.create("KAMAZ");
        cat.drive();
        kamaz.drive();

    }
}
interface Tractor {
    void drive ();
}

class CAT implements Tractor {
    @Override
    public void drive () {

        System.out.println("drive CAT");
    }

}
class KAMAZ implements Tractor {
    @Override
    public void drive() {

        System.out.println("drive KAMAZ");
    }
}
class Factory {
    public Tractor create (String typeOfTractor) {
        switch (typeOfTractor) {
            case "CAT" : return new CAT ();
            case "KAMAZ" : return new KAMAZ ();
            default: return null;
        }
    }
}