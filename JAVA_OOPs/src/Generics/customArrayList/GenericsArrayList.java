package Generics.customArrayList;

import java.util.Arrays;

public class GenericsArrayList<T> {
    private Object[] arr;
    private static int DEFAULT_SIZE=10;
    private int currSize=0;

    GenericsArrayList(){
        arr=new Object[DEFAULT_SIZE];
    }
    public boolean isEmpty(){
        return currSize==0;
    }
    private boolean isFull(){
        return currSize== arr.length;
    }
    private void resize() {
        int newCapacity = arr.length * 2;
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < currSize; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public boolean add(T num){
        if(isFull()){
            resize();
        }
        arr[currSize++]=num;
        return true;
    }
    public T get(int idx){
        if (idx >= currSize || idx < 0) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + currSize);
        }
        return (T)arr[idx];
    }
    public T remove(int idx){
        if (idx >= currSize || idx < 0) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + currSize);
        }
        T removedVal=(T)arr[idx];
        for(int i=idx;i<currSize;i++){
            arr[i]=arr[i+1];
        }
        currSize--;
        return  removedVal;
    }

    @Override
    public String toString() {
        return "GenericsArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", currSize=" + currSize +
                '}';
    }

    public int size(){
        return currSize;
    }

    public static int getDefaultSize() {
        return DEFAULT_SIZE;
    }
}
