package singleton_10;

public class SingleObject {
    private static SingleObject singleObject = null;
    private SingleObject(){}
    static {
        singleObject = new SingleObject();
    }
    public static SingleObject getInstance(){
        return singleObject;
    }
    /*private static SingleObject singleObject = new SingleObject();
    private SingleObject(){

    }
    public static SingleObject getInstance(){
        //if(this.singleObject == null){
        //    singleObject = new SingleObject();
        //}
        //return singleObject;//
        return singleObject;
    }*/
    /*private static class SingleHandler{
        private static SingleObject singleObject = new SingleObject();
    }
    private static SingleObject singleObject;
    private SingleObject(){

    }
    public static SingleObject getInstance(){
        return SingleHandler.singleObject;
    }*/
    /*public static SingleObject getInstance(){
        try {
            if(singleObject != null){

            }else {
                Thread.sleep(3000);
                synchronized (SingleObject.class){// wufa jiejue
                    singleObject = new SingleObject();
                }

            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return singleObject;
    }*/
    /*public static SingleObject getInstance(){
        try {
            synchronized (SingleObject.class) {
                if (singleObject != null){

                }else {
                    Thread.sleep(3000);
                    singleObject = new SingleObject();

                }
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return singleObject;
    }*/
    /*synchronized public static SingleObject getInstance(){
        try {
            if(singleObject != null){

            }else {
                Thread.sleep(3000);
                singleObject = new SingleObject();

            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return singleObject;
    }*/
}
