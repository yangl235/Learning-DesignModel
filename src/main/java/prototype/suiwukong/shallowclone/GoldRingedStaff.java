package prototype.suiwukong.shallowclone;

public class GoldRingedStaff {
    private float height = 100.0F;
    private float diameter = 10.0F;

    /**
     * 构造子
     */
    public GoldRingedStaff() {
        //your code
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    /**
     * 金箍棒增长，长度和半径增加一倍
     */
    public void grow() {
        this.diameter *= 2.0;
        this.height *= 2;
    }

    /**
     * 金箍棒缩小，长度和半径减少一半
     */
    public void shrink() {
        this.diameter /= 2;
        this.height /= 2;
    }

    /**
     * 移动
     */
    public void move() {
        //your code
    }


}
