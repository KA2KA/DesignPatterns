package DP_05_Singleton;

/**
 * Created by wuwg on 2016/8/30.
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {

    }

    public static class SingletonFactory {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public StaticInnerClassSingleton getInstance() {
        return SingletonFactory.instance;
    }



}
