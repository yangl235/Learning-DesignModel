package multiion_pattern.die;

import java.util.Date;
import java.util.Random;

public class Die {
    private static Die die1 = new Die();
    private static Die die2 = new Die();

    /**
     * 私有构造函数
     */
    private Die() {
    }

    /**
     * 工厂方法
     */
    public static Die getInstance(int whichOne) {
        if (whichOne == 1) {
            return die1;
        } else {
            return die2;
        }
    }

    /**
     * 掷骰子，返回一个1~6之间的随机数
     */
    public synchronized int dice() {
        Date d = new Date();
        Random r = new Random(d.getTime());
        int value = r.nextInt();
        value = Math.abs(value);
        value = value % 6;
        value += 1;
        return value;
    }

}
