package special.ch24;

import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

public class TestXML {
    public static void main(String[] args) throws SAXException, IOException {
        args = new String[]{"myxml.xml"};
        XMLProperties xml = new XMLProperties();
        xml.load(new File("/Users/yanglei_home/Downloads/MyCode/Java/Java_Design_Model/src/main/java/special/ch24/xml2.xml"));
        Enumeration keyEnum = xml.keys();
        Enumeration valueEnum = xml.elements();
        while (keyEnum.hasMoreElements()) {
            String key = (String) keyEnum.nextElement();
            String value = (String) valueEnum.nextElement();
            System.out.println(key + "=" + value);
        }
        OutputStream out = new FileOutputStream(new File("/Users/yanglei_home/Downloads/MyCode/Java/Java_Design_Model/src/main/java/special/ch24/out.xml"));
        xml.store(out, "test");
    }
}
