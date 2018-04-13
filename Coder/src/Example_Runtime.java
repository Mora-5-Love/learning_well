import java.io.File;

public class Example_Runtime {
    public static void main(String args[]){
        try {
            Runtime ce = Runtime.getRuntime();
            File file = new File("/usr/bin/python");
            ce.exec(file.getAbsolutePath());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
