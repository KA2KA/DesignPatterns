package DP_12_Bridge;

/**
 * Created by wuwg on 2016/8/31.
 */
public  abstract  class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

}
