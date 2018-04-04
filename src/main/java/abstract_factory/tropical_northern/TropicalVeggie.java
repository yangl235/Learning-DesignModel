package abstract_factory.tropical_northern;

public class TropicalVeggie implements Veggie {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public TropicalVeggie(String name) {
    }
}
