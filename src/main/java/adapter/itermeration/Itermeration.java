package adapter.itermeration;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 从Iterator到Enumeration的适配
 */
public class Itermeration implements Enumeration {
    private Iterator it;

    public Itermeration(Iterator it) {
        this.it = it;
    }

    public boolean hasMoreElements() {
        return it.hasNext();
    }

    public Object nextElement() throws NoSuchElementException {
        return it.next();
    }
}
