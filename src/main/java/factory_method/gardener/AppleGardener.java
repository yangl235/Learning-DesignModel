package factory_method.gardener;

public class AppleGardener implements FruitGardener {
    public Fruit factory() {
        return new Apple();
    }
}
