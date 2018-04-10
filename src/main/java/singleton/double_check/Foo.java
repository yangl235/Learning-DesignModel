package singleton.double_check;

import com.sun.tools.corba.se.idl.toJavaPortable.Helper;

//Single thread
public class Foo {
    private Helper helper = null;

    public synchronized Helper getHelper() {
        if (helper == null) {
            helper = new Helper();
            return helper;
        }
        //others
        return null;
    }
}

