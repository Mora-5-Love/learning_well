import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example_12 {
    public static void main(String args[]){
        char a[] = "loveispoor".toCharArray();
        int n = 0,m=0;
        try {
            File file = new File("secret.txt");
            for (int i = 0;i<a.length;i++){
                a[i] = (char)(a[i]^'R');
            }
            FileWriter writer = new FileWriter(file);
            writer.write(a,0,a.length);
            writer.close();
            FileReader reader = new FileReader(file);
            char[] tom = new char[10];
            System.out.println("Secret txt :");

            while ((n=reader.read(tom,0,10))!=-1){
                String s = new String(tom,0,n);
                System.out.println(s);

            }
            reader.close();

            System.out.println("Decode:");
            reader = new FileReader(file);
            while ((n=reader.read(tom,0,10))!=-1){
                for (int i = 0;i < n;i++){
                    tom[i] = (char)(tom[i]^'R');
                }
                String s = new String(tom,0,n);
                System.out.println(s);
            }
            reader.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
