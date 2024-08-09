package Enums;

public class Main {
    public static void main(String[]args){
        Week week;
        week=Week.Saturday;
        System.out.println(week);
        for(Week day:Week.values()){
            System.out.println(day);
        }
        System.out.println(week.ordinal());//gives the index at which the week is present in enum Week
        week.inEx();
        System.out.println(Week.valueOf("Tuesday"));
    }
}
