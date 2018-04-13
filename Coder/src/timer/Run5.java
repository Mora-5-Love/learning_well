package timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run5 {
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("Running and time is :"+ new Date());
        }

    }
    public static void main(String []args){
        MyTask task = new MyTask();
        Timer timer = new Timer();
        System.out.println("current time is "+ new Date().toLocaleString());
        timer.schedule(task,3000,7000);
    }
}
