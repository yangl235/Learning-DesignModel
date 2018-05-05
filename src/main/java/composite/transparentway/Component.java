package composite.transparentway;


import java.util.Enumeration;

public interface Component {
    /**
     * 某个商业方法
     */
    void sampleOperation();

    /**
     * 返还自己的实例
     *
     * @return
     */
    Composite getComposite();

    /**
     * 聚集管理方法，增加一个子构建对象
     *
     * @param component
     */
    void add(Component component);

    /**
     * 聚集管理方法，删除一个子构建对象
     *
     * @param component
     */
    void remove(Component component);

    /**
     * 聚集管理方法，返回聚集的Enumeration对象
     *
     * @return
     */
    Enumeration components();

}
