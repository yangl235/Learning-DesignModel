package factory_method.factory_method;

public class ConcreteCreater2 implements Creater {
    /**
     * 工厂方法
     * @return
     */
    public Product factory() {
        return new ConcreteProduct2();
    }
}
