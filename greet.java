import java.util.Scanner;

public class greet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        String name =sc.nextLine();
        System.out.println("enter the age");
        int age = sc.nextInt();

        System.out.println("name is "+name +"age is "+age);
        System.out.println("thank you ");

    }

    
}
