package factory_method.gardener;

public class Apple implements Fruit {

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    private int treeAge;

    public void grow() {
        System.out.println("Apple is growing...");
    }

    public void harvest() {
        System.out.println("Apple has been harvested");
    }

    public void plant() {
        System.out.println("Apple has been planted");
    }
}
