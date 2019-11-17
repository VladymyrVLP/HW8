package com.company;

public interface CustomCollection<E> extends Iterable<E>{
    boolean add(E e);
    boolean delete(int index);
    E get(int index);
    int size();


}
