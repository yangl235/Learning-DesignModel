package adapter.cube_ball;

public class MagicFinger implements BallIF {
    private double radius = 0;
    private static final double PI = 3.14D;
    private Cube adaptee;

    /**
     * 构造子
     *
     * @param adaptee
     */
    public MagicFinger(Cube adaptee) {
        super();
        this.adaptee = adaptee;
        radius = adaptee.getWidth();
    }

    public double calculateArea() {
        return PI * 4.0D * (radius * radius);
    }

    public double calculateVolume() {
        return PI * 4.0D / 3.0D * (radius * radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
