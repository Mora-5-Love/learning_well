package single;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(SingleObject.getInstance().hashCode());
    }
    public static void main(String []args){
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
