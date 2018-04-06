package singleton;

public class LazySingleton {
    private static LazySingleton m_instance = null;

    /**
     * 私有的默认构造子
     */
    private LazySingleton() {
    }

    /**
     * 静态工厂方法
     */
    synchronized public static LazySingleton getinstance() {
        if (m_instance == null) {
            m_instance = new LazySingleton();
        }
        return m_instance;
    }
}
