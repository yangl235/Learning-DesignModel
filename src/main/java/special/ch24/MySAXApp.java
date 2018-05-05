package special.ch24;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import java.io.FileReader;

public class MySAXApp extends DefaultHandler {
    /**
     * 构造子
     */
    public MySAXApp() {
        super();
    }

    @Override
    public void startDocument() {
        System.out.println("start Document()");
    }


    @Override
    public void endDocument() {
        System.out.println("endDocument()");
    }

    public void character(char[] ch, int start, int length)

    {
        System.out.println("character()");
        for (int i = start; i < start + length; i++) {
            System.out.println(ch[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        //指定使用的SAX驱动软件包为Xerces
        XMLReader xr = new org.apache.xerces.parsers.SAXParser();
        MySAXApp handler = new MySAXApp();
        //将MySAXApp的一个实例登记到XMLReader里
        xr.setContentHandler(handler);
        xr.setErrorHandler(handler);

        FileReader fr = new FileReader(args[0]);
        xr.parse(new InputSource(fr));

    }
}
