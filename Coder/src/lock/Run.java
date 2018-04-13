package lock;

public class Run {
    public static void main(String []args){
        Service service = new Service();
        Thread_A thread_a = new Thread_A(service);
        thread_a.setName("A");
        thread_a.start();
        Thread_B thread_b = new Thread_B(service);
        thread_b.setName("B");
        thread_b.start();
    }
}
