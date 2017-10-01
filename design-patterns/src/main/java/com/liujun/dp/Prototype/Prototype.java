package com.liujun.dp.Prototype;

import java.io.*;

/**
 * Created by JunLiu on 2017/5/17.
 */
public class Prototype implements Cloneable, Serializable {
    public static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject serializableObject;

    // 浇复制
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    // 深复制
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

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

    public SerializableObject getSerializableObject() {
        return serializableObject;
    }

    public void setSerializableObject(SerializableObject serializableObject) {
        this.serializableObject = serializableObject;
    }

    class SerializableObject implements Serializable {
        public static final long serialVersionUID = 1L;
    }
}
