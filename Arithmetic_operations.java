import java.util.Scanner;
public class ArithmeticOperations{
public static void main(String[] args)
{
int a,b;
Scanner read=new Scanner(System.in);
a=read.nextInt();
b=read.nextInt();
System.out.println("Sum:"+(a+b));
System.out.println("Difference:"+(a-b));
System.out.println("Product:"+(a*b));
System.out.println("Quotient:"+(a/b));
System.out.println("Remainder:"+(a%b));
}
}