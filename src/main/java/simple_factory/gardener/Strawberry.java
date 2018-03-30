package simple_factory.gardener;

public class Strawberry implements Fruit {

    public void grow() {
        log("Strawberry is growing...");
    }

    public void harvest() {
        log("Strawberry has been harvested");
    }

    public void plant() {
        log("Strawberry has been planted");
    }

    public static void log(String str) {
        System.out.println(str);
    }
}
