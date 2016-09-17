package DP_07_Prototype;

import java.io.*;

/**
 * Created by wuwg on 2016/8/30.
 */
public class CopyDemo implements Cloneable, Serializable {

    private String string;

    private SerializableObject obj;


    /**
     * 浅复制
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (CopyDemo) super.clone();
    }


    public Object deepClone() throws IOException, ClassNotFoundException {
//       写入当前对象的二进制流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
//       读出二进制流产生对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }
}
