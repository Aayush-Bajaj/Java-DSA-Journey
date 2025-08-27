// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class students1 {
   public students1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter the marks of first student");
      int var2 = var1.nextInt();
      System.out.println("enter the marks of second subject");
      int var3 = var1.nextInt();
      System.out.println("enter the marks of third subject");
      int var4 = var1.nextInt();
      int var5 = var2 + var3 + var4;
      int var6 = var5 / 3;
      System.out.println("total marks:" + var5);
      System.out.println("average marks :" + var6);
   }
}
