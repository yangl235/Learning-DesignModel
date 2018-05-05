package composite.safeway;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component {
    private Vector componentVector = new Vector();

    /**
     * 返还自己的实例
     *
     * @return
     */
    public Composite getComposite() {
        return this;
    }

    public void sampleOperation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()) {
            ((Component) enumeration.nextElement()).sampleOperation();
        }
    }

    public void add(Component component) {
        componentVector.addElement(component);
    }

    /**
     * 聚集管理方法，返还聚集的Enumeration对象
     *
     * @return
     */
    public Enumeration components() {
        return componentVector.elements();
    }

}
