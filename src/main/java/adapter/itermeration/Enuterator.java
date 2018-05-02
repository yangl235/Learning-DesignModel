package adapter.itermeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 从Enumeration到Iterator的适配
 */
public class Enuterator implements Iterator {

    Enumeration _enum;

    public Enuterator(Enumeration _enum) {
        this._enum = _enum;
    }

    public boolean hasNext() {
        return _enum.hasMoreElements();
    }

    public Object next() {
        return _enum.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
