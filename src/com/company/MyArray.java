package com.company;

import java.util.Iterator;

public class MyArray<E> implements CustomCollection<E> {

    private E[] array;
    MyArray(){
        array = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
       try {
           E[] newArray = array;
           array = (E[]) new Object[newArray.length + 1];
           System.arraycopy(newArray, 0, array, 0, newArray.length);
           array[array.length - 1] = e;
           return true;
       }catch (ClassCastException ex){
           ex.printStackTrace();
       }
       return false;
    }

    @Override
    public boolean delete(int index) {
      try {
          E[] newArray = array;
          array = (E[]) new Object[newArray.length - 1];
          System.arraycopy(newArray, 0, array, 0, index);
          int elemAfterIndex = newArray.length - index - 1;
          System.arraycopy(newArray, index + 1, array, index, elemAfterIndex);
          return true;
      }catch (ClassCastException ex){
          ex.printStackTrace();
      }
      return false;
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator<>(array);
    }
}
