package adapter.object_level;

/**
 * 适配器模式的用意是将接口不同而功能相同或相近的两个接口加以转换，而不是
 * 补充源角色没有的方法
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    /**
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源类有方法sampleOperation1()，因此适配器类直接委派即可
     */
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    /**
     * 源类没有方法sampleOperation2()，适配器类补充上这个方法
     */
    public void sampleOperation2() {
        //your code
    }
}
