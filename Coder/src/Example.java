import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;

public class Example implements Serializable {

    public static void main(String args[])
    {
        File f1 = new File("/home/whisper/","/home/whisper/love.txt");
        File f2 = new File("/home/whisper/");
        System.out.println(f1.getName()+"   "+f1.canRead());
    }

}
