package builder.builder;

public class Director {
    private Builder builder;
    /**
     * 产品构造方法，负责调用各个零件建造方法
     */
    public void construct() {
        builder = new ConcreteBuilder();
    }
}
