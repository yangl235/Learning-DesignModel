package decorator.order;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Vector;

public class Order {
    private OrderLine lnkOrderLine;

    protected String customerName;
    protected Date salesDate;
    protected Vector items = new Vector(10);

    public void print() {
        for (int i = 0; i < items.size(); i++) {
            OrderLine item = (OrderLine) items.get(i);
            item.printLine();
        }
    }

    public Order() {
    }

    /**
     * 添加一行销售产品
     *
     * @param item
     */
    public void addItem(OrderLine item) {
        items.add(item);
    }

    /**
     * 销售一行销售产品
     *
     * @param item
     */
    public void remoteItem(OrderLine item) {
        items.remove(item);
    }

    public double getGrandTotal() {
        double amnt = 0.0D;
        for (int i = 0; i < items.size(); i++) {
            OrderLine item = (OrderLine) items.get(i);
            amnt += item.getSubtotal();
        }
        return amnt;
    }

    /**
     * 工具方法，将金额格式化
     *
     * @param amnt
     * @return
     */
    protected String formatCurrency(double amnt) {
        return NumberFormat.getCurrencyInstance().format(amnt);
    }

    public OrderLine getLnkOrderLine() {
        return lnkOrderLine;
    }

    public void setLnkOrderLine(OrderLine lnkOrderLine) {
        this.lnkOrderLine = lnkOrderLine;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }
}
