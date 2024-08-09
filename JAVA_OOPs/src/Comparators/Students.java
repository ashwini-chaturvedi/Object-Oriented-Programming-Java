package Comparators;

public class Students implements Comparable<Students>{
    private int admNo;
     float marks;
    Students(int adm,float mark){
        this.marks=mark;
        this.admNo=adm;
    }

    @Override
    public int compareTo(Students o) {
           if(this.marks!=o.marks){
               return (int)(this.marks-o.marks);
           }else{
               return this.admNo-o.admNo;
           }
    }

    @Override
    public String toString() {
        return "Students{" +
                "admNo=" + admNo +
                ", marks=" + marks +
                '}';
    }
}
