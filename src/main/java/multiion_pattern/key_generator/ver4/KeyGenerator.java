package multiion_pattern.key_generator.ver4;


import java.util.HashMap;

public class KeyGenerator {
    private static KeyGenerator keygen = new KeyGenerator();
    private static final int POOL_SIZE = 20;
    private HashMap keyList = new HashMap(10);

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
    public synchronized int getNextKey(String keyName) {
        KeyInfo keyInfo;
        if (keyList.containsKey(keyName)) {
            keyInfo = (KeyInfo)keyList.get(keyName);
            System.out.println("key found");
        }
        else {
            keyInfo = new KeyInfo(POOL_SIZE, keyName);
            keyList.put(keyName, keyInfo);
            System.out.println("new key created");
        }
        return keyInfo.getNextKey(keyName);
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
