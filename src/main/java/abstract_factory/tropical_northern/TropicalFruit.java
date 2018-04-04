package abstract_factory.tropical_northern;

public class TropicalFruit implements Fruit{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public TropicalFruit(String name) {}


}
