package timer;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run4 {
    static int i = 0;
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("current i "+ i);
        }
    }
    public static void main(String []args){
        while (true){
            try {
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String datestring = "2018-4-9 10:25:00";
                Date date = format.parse(datestring);
                timer.schedule(task,date);
                timer.cancel();
            }catch (ParseException e){
                e.printStackTrace();
            }
        }
    }
}
