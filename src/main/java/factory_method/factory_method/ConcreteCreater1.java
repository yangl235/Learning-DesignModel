package factory_method.factory_method;

public class ConcreteCreater1 implements Creater {
    /**
     * 工厂方法
     * @return
     */
    public Product factory() {
        return new ConcreteProduct1();
    }
}
