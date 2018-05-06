package composite.draw.transparentway;

abstract public class Graphics {

    public abstract void draw();

    /**
     * 聚集管理方法，增加一个子构建对象
     *
     * @param g
     */
    public abstract void add(Graphics g);

    /**
     * 聚集管理方法，删除一个子构建对象
     *
     * @param g
     */
    public abstract void remove(Graphics g);

    /**
     * 返还一个子构建对象
     *
     * @param i
     * @return
     */
    public abstract Graphics getChild(int i);
}
