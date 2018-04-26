package prototype.panda;

public class PandaToClone {

    private int height, weight, age;

    public PandaToClone(int height, int weight) {
        this.age = 0;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public Object clone() {
        //创建一个本类的对象，返还给调用者
        PandaToClone temp = new PandaToClone(height, weight);
        temp.setAge(age);
        //返回的类型必须为Object
        return (Object) temp;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
