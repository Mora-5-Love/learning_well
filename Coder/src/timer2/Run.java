package timer2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    //true shouhu jincheng
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("running ~ time is "+ new Date());
        }
    }
    static public class MyTask_T extends TimerTask{
        @Override
        public void run() {
            System.out.println("running ~ time is "+ new Date());
        }
    }
    public static void main(String []args){
        try {
            MyTask task = new MyTask();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String datestring = "2018-4-9 10:25:00";
            Date date = format.parse(datestring);
            Timer timer = new Timer();
            System.out.println(
                    "time is "+ date.toLocaleString()+"current "+ new Date().toLocaleString()
            );
            timer.schedule(task, date,4000);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
    }
}
