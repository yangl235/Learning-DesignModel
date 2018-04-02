package factory_method.gardener;

public class GrapeGardener implements FruitGardener {
    public Fruit factory() {
        return new Grape();
    }
}
