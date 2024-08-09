package Generics.customArrayList;
import java.util.*;

public class wildCardBounds<T extends Number> {//T should be of Number class or Number Class's Subclass
    //this will make sure that our generic only includes members that are part of number class

    private Object[] arr;
    private static int DEFAULT_SIZE=10;
    private int currSize=0;

    wildCardBounds(){
        arr=new Object[DEFAULT_SIZE];
    }
    //IMPORTANT**** WILD CARD EXAMPLES
    public void forOnlyNumberClass(List<Number>list){//this will only take list of Number type not its subclass only number
        //do Something
    }
    public void forSubclass(List<? extends Number>list){//it will take list of Number class as well as its subclass type
        //Do something
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
    public int size(){
        return currSize;
    }

    public static int getDefaultSize() {
        return DEFAULT_SIZE;
    }
}
