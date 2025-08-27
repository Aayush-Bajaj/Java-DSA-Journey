import java.util.*;
public class circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        double radius = sc.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("area of the circle " + area);
    }
    
}
