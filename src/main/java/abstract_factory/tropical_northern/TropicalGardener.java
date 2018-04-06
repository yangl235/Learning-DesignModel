package abstract_factory.tropical_northern;

public class TropicalGardener implements Gardener {
    /**
     * 水果的工厂方法
     */
    public Fruit createFruit(String name) {
        return new TropicalFruit(name);
    }
    /**
     * 蔬菜的工厂方法
     */
    public Veggie createVeggie(String name) {
        return new TropicalVeggie(name);
    }
}
