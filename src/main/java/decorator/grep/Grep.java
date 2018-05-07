package decorator.grep;

import java.io.FileReader;
import java.io.IOException;

public class Grep {
    static GrepReader g;
    private static GrepView gv = new GrepView();

    public static void main(String[] args) {
        String line;
        args = new String[] {"SYSU","/Users/yanglei_home/Downloads/MyCode/Java/Java_Design_Model/src/main/java/decorator/grep/file1.txt"};
        if (args.length <= 1) {
            gv.println("Usage:java Grep ");
            gv.println("no regexp files to be searched in ");
            System.exit(1);
        }

        try {
            gv.println("\nGrep: 搜索" + args[0] + " 文件" + args[1]);
            gv.println("文件号和行号\r\t下面的行李含有所搜索的字符串\n");
            g = new GrepReader(new FileReader(args[1]), args[0]);
            for (; ; ) {
                line = g.readLine();
                if (line == null) {
                    break;
                }
                gv.println(args[1] + ":" + g.getLineNo() + "\t" + line);
            }
            g.close();
        } catch (Exception e) {
            gv.println(e.getMessage());
        }
    }
}
