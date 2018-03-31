package simple_factory.gardener;

public class Apple implements Fruit {

    private int treeAge;

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }


    public void grow() {
        log("Apple is growing");
    }

    public void harvest() {
        log("Apple has been harvested");
    }

    public void plant() {
        log("Apple has been planted");
    }


    public static void log(String str) {
        System.out.println(str);
    }
}
