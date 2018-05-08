package decorator.order;

public class HeaderDecorator extends OrderDecorator {
    public HeaderDecorator(Order anOrder) {
        super(anOrder);
    }


    @Override
    public void print() {
        this.printHeader();
        super.order.print();
    }

    private void printHeader() {
        System.out.println("\t***\tI N V O I C E***");
        System.out.println("XYZ Incorporated\nDate of Sale:");
        System.out.println(order.getSalesDate());
        System.out.println("=================================");
        System.out.println("Item\t\tUnit Price\tSubtotal");
    }


}
