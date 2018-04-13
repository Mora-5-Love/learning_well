package serial_single;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {
    private static class SingleHandle{
        private static final MyObject myobject = new MyObject();

    }
    private MyObject(){

    }
    public static MyObject getInstance(){
        return SingleHandle.myobject;
    }
    protected Object readResolve() throws ObjectStreamException{
        System.out.println(" read resolve");
        return SingleHandle.myobject;
    }
}
