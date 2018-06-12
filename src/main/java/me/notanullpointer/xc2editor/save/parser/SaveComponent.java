package me.notanullpointer.xc2editor.save.parser;

public interface SaveComponent<T> {

    byte[] toByteArray();
    T fromByteArray(byte[] bytes);

}
