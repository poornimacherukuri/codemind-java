import java.util.Scanner;
public class Capacity{
public static void main(String[] args)
{
int a,b,c;
Scanner read=new Scanner(System.in);
a=read.nextInt();
b=read.nextInt();
c=read.nextInt();
System.out.println((512*a*b*c*2)/1024+" KB");
}
}