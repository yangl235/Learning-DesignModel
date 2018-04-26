package prototype.register_prototype;

/**
 * 登记式原型模式
 */
public class ConcretePrototype implements Prototype {
    @Override
    public synchronized Object clone() {
        Prototype temp = null;
        try {
            temp = (Prototype) super.clone();
            return temp;
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed.");
        } finally {
            return temp;
        }
    }
}
