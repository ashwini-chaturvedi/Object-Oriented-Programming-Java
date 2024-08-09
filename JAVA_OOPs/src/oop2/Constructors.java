package oop2;

public class Constructors {
    public Constructors(){
        System.out.println("Hiiii");
    }
    public static void matrix(){
        int n=14;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = Math.abs(i - j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        student anuj=new student();
        student Ashwini=new student("Ashwini",89,80);
        student I=new student(Ashwini);
        student me;
        for(int i=1;i<199999;i++){//for lesser number of object creation we cannot see the grbage collection doing the work
            me=new student();
        }
    }
}
