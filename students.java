import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of first student");
        int marks = sc.nextInt();
        System.out.println("enter the marks of second subject");
        int marks2 = sc.nextInt();
        System.out.println("enter the marks of third subject");
        int marks3=sc.nextInt();

        int total = marks+marks2+marks3;
        int average =  total /3;
        System.out.println("total marks:" +total);
        System.out.println("average marks :"+average);

    }
    
}
