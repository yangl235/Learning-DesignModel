package factory_method.factory_method;

public class Client {

    private static Creater creater1, creater2;
    private static Product product1, product2;
    public static void main(String [] args) {
        creater1 = new ConcreteCreater1();
        product1 = creater1.factory();
        creater2 = new ConcreteCreater2();
        creater2.factory();
    }
}
