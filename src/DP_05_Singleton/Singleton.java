package DP_05_Singleton;

/**
 * Created by wuwg on 2016/8/30.
 */
public class Singleton {

    private  static Singleton instance =null;

    private  Singleton(){

    }

    private  static synchronized  void  syncInit(){
        if (instance ==null){
            instance = new Singleton();
        }
    }

    public static Singleton getInstance(){
        if (instance==null){
            syncInit();
        }
        return instance;
    }



}
