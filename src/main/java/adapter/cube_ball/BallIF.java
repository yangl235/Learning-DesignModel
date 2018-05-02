package adapter.cube_ball;

public interface BallIF {

    /**
     * 计算面积
     *
     * @return
     */
    double calculateArea();

    double calculateVolume();

    double getRadius();

    void setRadius(double radius);
}
