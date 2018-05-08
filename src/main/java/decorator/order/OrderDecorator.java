package decorator.order;

public class OrderDecorator extends Order {
    protected Order order;

    /**
     * 构造子
     *
     * @param order
     */
    public OrderDecorator(Order order) {
        this.order = order;
        this.setSalesDate((order.getSalesDate()));
        this.setCustomerName(order.getCustomerName());
    }

    @Override
    public void print() {
        super.print();
    }
}
