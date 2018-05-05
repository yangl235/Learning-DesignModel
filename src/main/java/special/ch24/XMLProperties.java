package special.ch24;

import org.xml.sax.Parser;
import org.xml.sax.DocumentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.Locator;


import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Properties和XML数据之间的转换器
 * 如
 * <properties
 * <key name="My_key1"My_Value1</key
 * <key name=" My_key2"My_Value2</key
 * </properties
 */
public class XMLProperties extends Properties {
    XMLParser p = null;

    /**
     * 从一个输入流读入XML
     *
     * @param in
     * @throws IOException
     */
    @Override
    public synchronized void load(InputStream in) throws IOException {
        try {
            p = new XMLParser(in, this);
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    /**
     * 将XML文件读入
     *
     * @param file
     * @throws SAXException
     * @throws IOException
     */
    public synchronized void load(File file) throws SAXException, IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        XMLParser p = null;
        try {

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * 调用store(OutputStream out, String header)方法
     *
     * @param out
     * @param header
     */
    @Override
    public synchronized void save(OutputStream out, String header) {
        try {
            store(out, header);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * 将此property列表写入到输出流里
     *
     * @param out
     * @param header
     * @throws IOException
     */
    @Override
    public synchronized void store(OutputStream out, String header) throws IOException {
        PrintWriter wout = new PrintWriter(out);
        wout.println("<?xml version='1.0'?>");
        if (header != null) {
            wout.println("<!--" + header + "-->");
        }
        wout.print("<properties>");
        for (Enumeration e = keys(); e.hasMoreElements(); ) {
            String key = (String) e.nextElement();
            String val = (String) get(key);
            wout.print("\n <key name=\"" + key + "\">");
            wout.print(encode(val));
            wout.print("</key>");
        }
        wout.print("\n</properties>");
        wout.flush();
    }

    /**
     * @param string
     * @return
     */
    protected StringBuffer encode(String string) {
        int len = string.length();
        StringBuffer buffer = new StringBuffer(len);
        char c;
        for (int i = 0; i < len; i++) {
            switch (c = string.charAt(i)) {
                case '&':
                    buffer.append("&amp");
                    break;
                case '>':
                    buffer.append(">");
                    break;
                case '<':
                    buffer.append("<");
                    break;
                default:
                    buffer.append(c);
            }
        }
        return buffer;
    }

    /**
     * 创建一个没有内容的默认空的property
     */
    public XMLProperties() {
        super();
    }

    /**
     * 创建一个空的property，并以传入的property为默认值
     *
     * @param defaults
     */
    public XMLProperties(Properties defaults) {
        super(defaults);
    }
}
