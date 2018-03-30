package simple_factory.gardener;

public class Grape implements Fruit {

    private boolean seedless;

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }


    public void grow() {
        log("Grape is growing...");
    }

    public void harvest() {
        log("Grape has been harvested");
    }

    public void plant() {
        log("Grape has been planted");
    }

    public static void log(String str) {
        System.out.println(str);
    }
}
