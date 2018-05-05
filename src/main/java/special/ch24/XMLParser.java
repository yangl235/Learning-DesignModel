package special.ch24;


import org.xml.sax.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.xerces.parsers.SAXParser;

class XMLParser implements DocumentHandler {

    private static final int IN_NOTHING = 0;
    private static final int IN_DOCUMENT = 1;
    private static final int IN_KEY = 2;
    private int state = IN_NOTHING;
    private String key;
    private StringBuffer value;
    private Parser parser;
    private Class parser_class = null;
    private Properties xmlprop = null;
    public static final String PARSER_P = "org.apache.xerces.parsers.SAXParser";

    /**
     * @return
     * @throws ClassNotFoundException
     */
    private Class getParserClass() throws ClassNotFoundException {
        if (parser_class == null) {
            parser_class = Class.forName(PARSER_P);
        }
        return parser_class;
    }

    private Parser getParser() {
        try {
            return (Parser) getParserClass().newInstance();
        } catch (Exception ex) {
            throw new RuntimeException("Unable to intantiate: " + PARSER_P);
        }
    }

    /**
     * @param in
     * @param xmlprop
     * @throws IOException
     * @throws SAXException
     */
    XMLParser(InputStream in, XMLProperties xmlprop) throws IOException, SAXException {
        this.xmlprop = xmlprop;
        state = IN_NOTHING;
        value = new StringBuffer();
        try {
            parser = getParser();
            parser.setDocumentHandler(this);
            parser.parse(new InputSource(in));
        } catch (Exception e) {
            e.printStackTrace();
            throw new SAXException("can't create parser");
        }
    }

    /**
     * @param name
     * @param atts
     * @throws SAXException
     */
    public void startElement(String name, AttributeList atts) throws SAXException {
        if (state == IN_NOTHING) {
            if (name.equals("properties")) {
                state = IN_DOCUMENT;
            } else {
                throw new SAXException("attempt to find root properties");
            }
        } else if (state == IN_DOCUMENT) {
            if (name.equals("key")) {
                state = IN_KEY;
                key = atts.getValue("name");
                if (key == null) {
                    throw new SAXException("no name for key " + atts);
                }
            } else {
                throw new SAXException("attempt to find key" + atts);
            }
        } else {
            throw new SAXException("invalid element" + name);
        }
    }

    /**
     * @param name
     * @throws SAXException
     */
    public void endElement(String name) throws SAXException {
        if (state == IN_KEY) {
            xmlprop.setProperty(key, value.toString());
            System.out.println("<key name=\"" + key + "\">");
            System.out.println(value.toString() + "</key>\n");
            state = IN_DOCUMENT;
            name = null;
            value = new StringBuffer();
        } else if (state == IN_DOCUMENT) {
            state = IN_NOTHING;
        }
    }

    /**
     * @param ch
     * @param start
     * @param length
     * @throws SAXException
     */
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (state == IN_KEY) {
            compute(ch, start, length);
        }
    }

    public void setDocumentLocator(Locator locator) {

    }

    public void startDocument() throws SAXException {

    }

    public void endDocument() throws SAXException {

    }


    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {

    }

    public void processingInstruction(String target, String data) throws SAXException {

    }

    /**
     * @param ch
     * @param start
     * @param length
     */
    public void compute(char[] ch, int start, int length) {
        int st = start;
        int len = length - 1;
        while (st < length && ((ch[st] == '\n') || (ch[st] == '\t') || (ch[st] == ' ') || (ch[st] == '\r'))) {
            st++;
        }
        while (len > 0 && ((ch[len] == '\n') || (ch[len] == ' ') || (ch[len] == '\r'))) {
            len--;
        }
        while (st <= len) {
            value.append(ch[st]);
            st++;
        }
    }
}
