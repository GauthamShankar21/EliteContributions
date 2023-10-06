
import java.util.*;
import java.lang.*;
import java.io.*;

class Luckynumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            long no=sc.nextLong();
            if(no%2==0)
            {
                 for(int j=0;j<10;j++)
                {
                    if(Math.pow(2, j)==no)
                    {
                        if(j%2==0)
                            System.out.println("1");
                        else
                            System.out.println("0");
                        break;
                    }
                }
            }
             else
                    System.out.println("0");
        } 
    }
}


