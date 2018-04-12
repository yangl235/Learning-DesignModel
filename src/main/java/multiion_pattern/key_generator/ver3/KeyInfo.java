package multiion_pattern.key_generator.ver3;

public class KeyInfo {
    private int keyMax;
    private int keyMin;
    private int nextKey;
    private int poolSize;

    public KeyInfo(int poolSize) {
        this.poolSize = poolSize;
        retrieveFromDB();
    }

    /**
     * 获取键的最大值
     */
    public int getKeyMax() {
        return keyMax;
    }

    /**
     * 获取键的最小值
     */
    public int getKeyMin() {
        return keyMin;
    }

    /**
     * 提供键的当前值
     */
    public int getNextKey() {
        if (nextKey > keyMax) {
            retrieveFromDB();
        }
        return nextKey++;
    }

    /**
     * 从数据库提取键的适当值
     */
    private void retrieveFromDB() {
        String sql1 = "UPDATE KeyTable SET keyValue = keyValue + " + poolSize + " WHERE keyName = 'PO_NUMBER'";
        String sql2 = "SELECT keyValue FROM KeyTable WHERE KeyName = 'PO_NUMBER'";
        //execute the above queries in a transaction and commit it
        //assume the value returned is 1000;
        //示例返回一个值
        int keyFromDB = 1000;
        keyMax = keyFromDB;
        keyMin = keyFromDB - poolSize + 1;
        nextKey = keyMin;
    }
}
