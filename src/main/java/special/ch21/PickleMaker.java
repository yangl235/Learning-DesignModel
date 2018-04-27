package special.ch21;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 显示Beans.instantiate()的用法
 */
public class PickleMaker extends Frame {
    /**
     * 创建frame视窗，显示TextField
     *
     * @param text
     * @param size
     */
    PickleMaker(String text, int size) {
        /**
         * (1) 调用超类的构造子
         * (2) 增加一个事件监听对象
         * (3) 将布局管理器改为Flow类型
         */
        super("Pickle Macler");
        addWindowListener(new ShowPicke.win());
        setLayout(new FlowLayout());
        /**
         * 创建TextField对象并将它串行化
         */
        TextField textField = makeTextField(text, size);
        serializeTextField(textField, "mytextfield.ser");
        add(textField);
    }

    /**
     * 创建一个TextField对象
     *
     * @param text
     * @param size
     * @return
     */
    private TextField makeTextField(String text, int size) {
        TextField textField = new TextField(text, size);
        return textField;
    }

    /**
     * 将传进来的TextField对象串行化
     *
     * @param textField
     * @param filename
     */
    private void serializeTextField(TextField textField, String filename) {
        try {
            FileOutputStream outputStream = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            out.writeObject(textField);
            out.flush();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * 创建一个frame对象，显示一个TextField
     *
     * @param args
     */
    public static void main(String[] args) {
        Frame frame = new PickleMaker("No matter where you go, &this.", 25);
        frame.setBounds(0, 0, 300, 200);
        frame.setVisible(true);
    }

}
