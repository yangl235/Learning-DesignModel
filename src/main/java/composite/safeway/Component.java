package composite.safeway;

public interface Component {
    /**
     * 返还自己的实例
     *
     * @return
     */
    Component getComposite();

    /**
     * 狗哥商业方法
     */
    void sampleOperation();
}
