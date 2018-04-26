package prototype.panda;

public class Client {
    private static PandaToClone thisPanda, thatPanda;

    public static void main(String[] args) {
        thisPanda = new PandaToClone(15, 25);
        thisPanda.setAge(3);

        //cloning the first
        thatPanda = (PandaToClone) thisPanda.clone();
        System.out.println("Age of thisPanda: " + thisPanda.getAge());
        System.out.println("          height: " + thisPanda.getHeight());
        System.out.println("          weight: " + thisPanda.getWeight());


        System.out.println("Age of thatPanda: " + thatPanda.getAge());
        System.out.println("          height: " + thatPanda.getHeight());
        System.out.println("          weight: " + thatPanda.getWeight());

    }

}
