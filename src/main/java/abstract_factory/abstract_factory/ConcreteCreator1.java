package abstract_factory.abstract_factory;

public class ConcreteCreator1 implements Creator {
    public ProductA factoryA() {
        return new ProductA1() {
        };
    }

    public ProductB factoryB() {
        return new ProductB1() {
        };
    }
}
