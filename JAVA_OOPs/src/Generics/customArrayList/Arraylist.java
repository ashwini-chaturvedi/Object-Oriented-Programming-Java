package Generics.customArrayList;

public class Arraylist {
    private int[] arr;
    private static int DEFAULT_SIZE=10;
    private int currSize=0;

    Arraylist(){
        arr=new int[DEFAULT_SIZE];
    }
    public boolean isEmpty(){
        return currSize==0;
    }
    private boolean isFull(){
        return currSize== arr.length;
    }
    private void resize(){
       int newLength=arr.length*2;
        int [] newArr=new int[newLength];
        for(int i=0;i<currSize;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
    }
    public boolean add(int num){
        if(isFull()){
            resize();
        }
        arr[currSize++]=num;
        return true;
    }
    public int get(int idx){
        return arr[idx];
    }
    public int remove(int idx){
        int removedVal=arr[idx];
        for(int i=idx;i<currSize;i++){
            arr[i]=arr[i+1];
        }
        currSize--;
        return removedVal;
    }
    public int size(){
        return currSize;
    }

    public static int getDefaultSize() {
        return DEFAULT_SIZE;
    }
}
