package simple_factory.simplified_one_class;

public class ConcreteProduct {
    /**
     * 三个原本独立的角色：工厂角色，抽象产品及具体产品角色都已经合并成为一个类
     */
    public ConcreteProduct(){}
    /**
     * 静态工厂方法
     */
    public static ConcreteProduct factory()
    {
        return new ConcreteProduct();
    }

}
