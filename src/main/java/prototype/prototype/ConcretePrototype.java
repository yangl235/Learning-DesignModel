package prototype.prototype;

public class ConcretePrototype implements Prototype {
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
