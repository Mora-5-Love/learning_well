public class SingleThread extends Thread {
    @Override
    public void run(){
        System.out.println(Single.getSingle().hashCode());
    }
    public static void main(String []args){
        SingleThread st1= new SingleThread();
        SingleThread st2 = new SingleThread();
        SingleThread st3 = new SingleThread();

        st1.start();
        st2.start();
        st3.start();
    }

}
