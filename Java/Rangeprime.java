import java.util.Scanner;
class Rangeprime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lower range");
int low=sc.nextInt();
System.out.println("Enter the upper range");
int upp=sc.nextInt();
int check;

for(int i=low;i<=upp;i++)
{
int count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
{
count++;
}
}


if(count==2)
{
System.out.println("The prime number is "+i);

}
}
}
}
