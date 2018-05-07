package decorator.decrator;

public class Decorator implements Component {
    private Component component;

    /**
     * 构造子
     *
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }

    public Decorator() {
        //your code
    }

    /**
     * 商业方法，委派给构建
     */
    public void sampleOperation() {
        component.sampleOperation();
    }
}
