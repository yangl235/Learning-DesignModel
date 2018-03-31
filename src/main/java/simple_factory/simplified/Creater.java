package simple_factory.simplified;

public class Creater {
    /**
     * 静态工厂方法
     */
    public static ConcreteProduct factory() {
        return new ConcreteProduct();
    }
}
