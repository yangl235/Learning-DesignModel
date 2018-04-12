package multiion_pattern.key_generator.ver2;


public class KeyGenerator {
    private static KeyGenerator keygen = new KeyGenerator();
    private int key = 1000;

    /**
     * 私有的构造函数
     */
    private KeyGenerator() {
    }

    /**
     * 静态工厂方法
     */
    public static KeyGenerator getInstance() {
        return keygen;
    }

    /**
     * 取下一个值
     */
    public synchronized int getNextKey() {
        return getNextkeyFromDB();
    }

    private int getNextkeyFromDB() {
        String sql1 = "UPDATE KeyTable SET keyValue = keyValue + 1";
        String sql2 = "SELECT keyValue FROM KeyTable";
        //execute the update SQL
        //run SELECT query
        //示例返回一个值
        return 1000;
    }
}
