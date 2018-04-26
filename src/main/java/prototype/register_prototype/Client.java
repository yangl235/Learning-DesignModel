package prototype.register_prototype;

public class Client {
    private Prototype prototype;
    private PrototypeManager mgr;

    public void registerPrototype() {
        prototype = new ConcretePrototype();
        Prototype copytype = (Prototype) prototype.clone();
        mgr.add(copytype);
    }

    public void operation(Prototype example) {
        Prototype p = (Prototype) example.clone();
    }
}
