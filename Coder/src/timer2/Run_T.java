package timer2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run_T {
    static public class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("running ~ time is "+ new Date());
            this.cancel();
        }
    }
    static public class MyTask_T extends TimerTask{
        @Override
        public void run() {
            System.out.println("runningT ~ time is "+ new Date());
        }
    }
    public static void main(String []args){
        try{
            MyTask myTask = new MyTask();
            MyTask_T myTask_t = new MyTask_T();
            Run.MyTask task = new Run.MyTask();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String datestring = "2018-4-9 10:25:00";
            Date date = format.parse(datestring);
            Timer timer = new Timer();
            timer.schedule(myTask,date,4000);
            timer.schedule(myTask_t,date,4000);
        }
       catch (ParseException e){
            e.printStackTrace();
       }

    }
}
