package prototype.suiwukong.shallowclone;

import java.util.Date;

public class Monkey implements Cloneable {
    private int height;
    private int weight;
    private GoldRingedStaff staff;
    private Date birtthDate;

    public Monkey() {
        this.birtthDate = new Date();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public GoldRingedStaff getStaff() {
        return staff;
    }

    public void setStaff(GoldRingedStaff staff) {
        this.staff = staff;
    }

    public Date getBirtthDate() {
        return birtthDate;
    }

    public void setBirtthDate(Date birtthDate) {
        this.birtthDate = birtthDate;
    }

    /**
     * 克隆方法
     */


    @Override
    public Object clone() {
        Monkey temp = null;
        try {
            temp = (Monkey) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed");
        } finally {
            return temp;
        }
    }
}
