package simple_factory.simple_factory;

public class Creater {
    /**
     * 静态工厂方法
     */
    public static Product factory() {
        return new ConcreteProduct();
    }
}
