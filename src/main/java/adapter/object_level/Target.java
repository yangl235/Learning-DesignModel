package adapter.object_level;

public interface Target {
    /**
     * 源类也有方法sampleOperation1()
     */
    void sampleOperation1();

    /**
     * 源类没有的方法
     */
    void sampleOperation2();
}
