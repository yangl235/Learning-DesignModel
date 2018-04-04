package abstract_factory.tropical_northern;

public class NorthernGardener implements Gardener {
    /**
     * 水果的工厂方法
     */
    public Fruit createFruit(String name) {
        return new NorthernFruit(name);
    }

    /**
     * 蔬菜的工厂方法
     */
    public Veggie createVeggie(String name) {
        return new NorthernVeggie(name);
    }

}
