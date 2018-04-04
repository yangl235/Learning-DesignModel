package abstract_factory.abstract_factory;

public interface Creator {
    /**
     * 产品等级结构A的工厂方法
     */
    public ProductA factoryA();
    /**
     * 产品等级结构B的工厂方法
     */
    public ProductB factoryB();
}
