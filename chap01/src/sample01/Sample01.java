package sample01;

public class Sample01 {
    public static void main (String[] args) {
        int hour = 3;
        int minutes = 30;

        System.out.println(hour + "시 " + minutes + "분");

        int totalMinutes = hour * 60 + minutes;

        System.out.println(totalMinutes + "분");
    }
}
