package special.ch21;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.Beans;

/**
 * 显示被串行化的TextField对象
 */
public class ShowPicke extends Frame {
    /**
     * 创建一个frame视窗，将布局改为FlowLayout,将传入的TextField并行化，加入到视窗上
     *
     * @param setComponent
     */
    ShowPicke(String setComponent) {
        /**
         * 调用超类的构造子，加上一个监听器对象，监听视窗的关闭事件
         */
        super("Show Pickle");
        addWindowListener(new win());
        setLayout(new FlowLayout());

        /**
         * 将串行化的TextField对象实例化，如果找不到串行化的对象，显示一个普通的TextField
         */
        TextField text;
        try {
            text = (TextField) Beans.instantiate(null, setComponent);
        } catch (Exception e) {
            System.out.println(e);
            text = new TextField();
        }
        add(text);
    }

    public static void main(String[] args) {
        Frame frame = new ShowPicke("mytextfield");
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * 内部类实现了监听功能，在接受到操作系统传来的关闭窗口事件时，将应用程序结束
     */
    static class win extends WindowAdapter {
        /**
         * @param evt
         */
        @Override
        public void windowClosing(WindowEvent evt) {
            Frame frame = (Frame) evt.getSource();
            frame.setVisible(false);
            frame.dispose();
            System.exit(0);
        }
    }

}
