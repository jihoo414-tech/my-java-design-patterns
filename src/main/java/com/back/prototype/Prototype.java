package com.back.prototype;

public abstract class Prototype<T> implements Cloneable {

    @SuppressWarnings("unckecked")
    public T copy(){
        try{
            return (T) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
}
