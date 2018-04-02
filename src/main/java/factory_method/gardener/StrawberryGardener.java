package factory_method.gardener;

public class StrawberryGardener implements FruitGardener {
    public Fruit factory() {
        return new Strawberry();
    }
}
