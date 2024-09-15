import java.util.Scanner;
class MultiplyRunner {
     public static void main(String[] args)
     {
        Multiply cal=new Multiply();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b=sc.nextFloat();
        cal.setA(a);
        cal.setB(b);
        cal.doMultiply();
        System.out.println("Multiplication is: "+cal.getMul());
     }
}
