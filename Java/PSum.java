import java.util.Scanner;
class PSum
{
public static void main(String args[])
{
int n1,n2,d1,d2,s=0,n3,n4;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two Number");
n1=sc.nextInt();
n2=sc.nextInt();
n3=n1;
n4=n2;
while(n1!=0)
{
d1=n1%10;
d2=n2%10;
s=s+d1*d2;
n1=n1/10;
n2=n2/10;
}
System.out.println("Sum of product of corresponding digit of "+n3+" and "+n4+" is :"+s);
}
}
