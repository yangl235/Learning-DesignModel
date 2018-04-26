package prototype.register_prototype;

import java.util.Vector;

public class PrototypeManager {
    private Vector objects = new Vector();

    /**
     * 聚集管理方法：增加一个新的对象
     */
    public void add(Prototype object) {
        objects.add(object);
    }

    /**
     * 聚集管理方法：取出聚集中的一个对象
     */
    public Prototype get(int i) {
        return (Prototype) objects.get(i);
    }

    /**
     * 聚集管理方法：给出聚集的大小
     */
    public int getSize() {
        return objects.size();
    }

}
