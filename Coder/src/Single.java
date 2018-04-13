public class Single {
    private static Single single = new Single();
    private Single(){

    }

    public static Single getSingle(){
        return single;
    }
}

