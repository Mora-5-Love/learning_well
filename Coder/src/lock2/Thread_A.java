package lock2;

public class Thread_A extends Thread {
    private Service service;
    public Thread_A(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
