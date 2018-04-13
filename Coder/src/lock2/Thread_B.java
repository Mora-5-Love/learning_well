package lock2;

public class Thread_B extends Thread {
    private Service service;
    public Thread_B(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
