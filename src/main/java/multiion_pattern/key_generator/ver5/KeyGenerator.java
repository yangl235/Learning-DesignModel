package multiion_pattern.key_generator.ver5;


import java.util.HashMap;

public class KeyGenerator {
    private static final int POOL_SIZE = 20;
    private static HashMap keygens = new HashMap(10);
    private KeyInfo keyInfo;

    /**
     * 私有的构造函数
     */
    private KeyGenerator() {
    }

    /**
     * 私有的带参构造函数
     */
    private KeyGenerator(String keyName) {
        keyInfo = new KeyInfo(POOL_SIZE, keyName);
    }

    /**
     * 静态工厂方法
     */
    public static KeyGenerator getInstance(String keyName) {
        KeyGenerator keygen;
        if (keygens.containsKey(keyName)) {
            keygen = (KeyGenerator) keygens.get(keyName);
        } else {
            keygen = new KeyGenerator(keyName);
        }
        return keygen;
    }

    /**
     * 取下一个值
     */
    public synchronized int getNextKey() {
        return keyInfo.getNextKey();
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
