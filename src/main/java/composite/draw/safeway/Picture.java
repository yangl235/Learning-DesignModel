package composite.draw.safeway;

import java.util.Vector;

public class Picture extends Graphics {
    private Vector list = new Vector(10);

    @Override
    public void draw() {
        for (int i = 0; i < list.size(); i++) {
            Graphics g = (Graphics) list.get(i);
            g.draw();
        }
    }

    /**
     * 聚集管理方法，增加一个子构建对象
     *
     * @param g
     */
    public void add(Graphics g) {
        list.add(g);
    }

    /**
     * 聚集管理方法，删除一个子构建对象
     *
     * @param g
     */
    public void remove(Graphics g) {
        list.remove(g);
    }


    /**
     * 返还一个子构建对象
     *
     * @param i
     * @return
     */
    public Graphics getChild(int i) {
        return (Graphics) list.get(i);
    }
}
