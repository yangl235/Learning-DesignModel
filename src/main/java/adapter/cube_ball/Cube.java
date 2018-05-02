package adapter.cube_ball;

public class Cube {
    private double width;

    /**
     * 构造子
     *
     * @param width
     */
    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 计算立方体体积
     *
     * @return
     */
    public double calculateVolume() {
        return width * width * width;
    }

    /**
     * 计算面积
     *
     * @return
     */
    public double calculateFaceArea() {
        return width * width;
    }
}
