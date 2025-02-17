package co.com.screenplay.lulo.utils;

public class Time {

    private Time(){}

    public static void waiting(int wait){
        try {
            Thread.sleep(wait * 1000L);
        }catch (InterruptedException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
