public class Single_2 {
    private static Single_2 single_2;
    private Single_2(){

    }
    synchronized public static Single_2 getSingle_2(){
        try {
            if(single_2 !=null){
                //single_2 = new Single_2();
            }else {
                Thread.sleep(2000);
                single_2 = new Single_2();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return single_2;
    }

}
