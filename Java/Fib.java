import java.util.Scanner;
class Fib
{
public static void main(String args[])
{
int f1=0,f2=1,f3=1,start,end;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range for Fibonacci Numbers");
start=sc.nextInt();
end=sc.nextInt();
System.out.println("The Fibonacci numbers in Given range are...");
for(;f3<=end;f3=f1+f2)
{
if(f3>=start)
System.out.println(f3);
f1=f2;
f2=f3;
}
}
}
