package single;

import lock2.Thread_B;

public class SingleObject {
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
    private static SingleObject singleObject;
    private SingleObject(){

    }
    public static SingleObject getInstance(){
        try {
            if(singleObject != null){

            }else {
                Thread.sleep(3000);
                synchronized (SingleObject.class){// wufa jiejue
                    if(singleObject == null)
                        singleObject = new SingleObject();
                }

            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return singleObject;
    }
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
