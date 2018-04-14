package builder.builder;

public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    /**
     * 产品零件构造方法
     */
    @Override
    public void buildPart1() {

    }

    /**
     * 产品零件构造方法
     */
    @Override
    public void buildPart2() {

    }

    /**
     * 产品返还方法
     *
     * @return
     */
    @Override
    public Product retrieveResult() {
        return product;
    }
}
