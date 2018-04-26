package prototype.prototype;

public class Client {
    private Prototype prototype;

    public void operation(Prototype example) {
        Prototype p = (Prototype) example.clone();
    }
}
