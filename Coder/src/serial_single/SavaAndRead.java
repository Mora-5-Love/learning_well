package serial_single;

import java.io.*;

public class SavaAndRead {
    public static void main(String[] args){

        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(
                    "myobject.txt"));
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(myObject);
            outputStream.close();
            fileOutputStream.close();
            System.out.println(myObject.hashCode());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(new File(
                    "myobject.txt"
            ));
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            MyObject myObject = (MyObject) inputStream.readObject();
            inputStream.close();
            fileInputStream.close();
            System.out.println(myObject.hashCode());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
