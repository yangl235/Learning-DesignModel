package prototype.suiwukong.deepclone;

import java.io.*;
import java.util.Date;

public class Monkey implements Cloneable, Serializable {
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
     *
     * @return
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

    /**
     * 深克隆方法
     *
     * @return
     * @throws IOException
     * @throws OptionalDataException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, OptionalDataException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        //将对象从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }
}
