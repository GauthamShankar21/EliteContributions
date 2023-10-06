import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            float l=sc.nextFloat();
            float r=sc.nextFloat();
            float tt=sc.nextFloat();
            double ls=Math.ceil(tt/l);
            int rs=(int)(tt/r);
            System.out.println((int)(ls+rs));

        }
    }
}
