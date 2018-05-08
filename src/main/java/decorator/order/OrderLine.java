package decorator.order;

import java.text.NumberFormat;

public class OrderLine {
    private String itemName;
    private int units;
    private double unitPrice;

    public void printLine() {
        System.out.println(itemName + "\t" + units + "\t" + formatCurrency(unitPrice)
                + "\t" + formatCurrency(getSubtotal()));
    }

    /**
     * 小计金额的取值方法
     *
     * @return
     */
    public double getSubtotal() {
        return unitPrice * units;
    }

    private String formatCurrency(double amnt) {
        return NumberFormat.getCurrencyInstance().format(amnt);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }


}
