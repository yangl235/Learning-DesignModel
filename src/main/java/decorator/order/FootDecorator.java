package decorator.order;

public class FootDecorator extends OrderDecorator {
    public FootDecorator(Order anOrder) {
        super(anOrder);
    }

    @Override
    public void print() {
        super.order.print();

    }

    private void printFooter() {
        System.out.println("===========================");
        System.out.println("Total\t\t\t\t" + formatCurrency(super.order.getGrandTotal()));
    }
}
