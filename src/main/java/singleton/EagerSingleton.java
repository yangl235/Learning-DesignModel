package singleton;

public class EagerSingleton {
    private static final EagerSingleton m_instance = new EagerSingleton();
    /**
     * 私有的默认构造子
     */
    private EagerSingleton() { }
    /**
     * 静态工厂方法
     */
    public static EagerSingleton getInstance() {
        return m_instance;
    }
}
