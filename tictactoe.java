import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
public class tictactoe {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
       FastReader sc = new FastReader();
        int t=sc.nextInt();
         while (t-->0){
             String b[]=new String[3];
             int x=0,o=0,n=0;
             for(int i=0;i<3;i++)
             {
                 b[i]= sc.next();
             }
            for(int i=0;i<3;i++)
            {  String row=b[i];
                for(int j=0;j<3;j++)
                {
                      char ch=row.charAt(j);
                      if(ch=='X'){x++;}
                      else if (ch=='O'){o++;}
                      else {n++;}
                }
            }
            int winx=0,wino=0;
             if(b[0].charAt(0)=='X'&&b[0].charAt(1)=='X'&&b[0].charAt(2)=='X')
             {
                 winx=1;
             }
             if(b[1].charAt(0)=='X'&&b[1].charAt(1)=='X'&&b[1].charAt(2)=='X')
             {
                 winx=1;
             }
             if(b[2].charAt(0)=='X'&&b[2].charAt(1)=='X'&&b[2].charAt(2)=='X')
             {
                 winx=1;
             }
             if(b[0].charAt(0)=='O'&&b[0].charAt(1)=='O'&&b[0].charAt(2)=='O')
             {
                 wino=1;
             }
             if(b[1].charAt(0)=='O'&&b[1].charAt(1)=='O'&&b[1].charAt(2)=='O')
             {
                 wino=1;
             }
             if(b[2].charAt(0)=='O'&&b[2].charAt(1)=='O'&&b[2].charAt(2)=='O')
             {
                 wino=1;
             }
             if(b[0].charAt(0)=='X'&&b[1].charAt(0)=='X'&&b[2].charAt(0)=='X')
             {
                 winx=1;
             }
             if(b[0].charAt(1)=='X'&&b[1].charAt(1)=='X'&&b[2].charAt(1)=='X')
             {
                 winx=1;
             }
             if(b[0].charAt(2)=='X'&&b[1].charAt(2)=='X'&&b[2].charAt(2)=='X')
             {
                 winx=1;
             }
             if(b[0].charAt(0)=='X'&&b[1].charAt(1)=='X'&&b[2].charAt(2)=='X')
             {
                 winx=1;
             }
             if(b[2].charAt(0)=='X'&&b[1].charAt(1)=='X'&&b[0].charAt(2)=='X')
             {
                 winx=1;
             }



             if(b[0].charAt(0)=='O'&&b[1].charAt(0)=='O'&&b[2].charAt(0)=='O')
             {
                 wino=1;
             }
             if(b[0].charAt(1)=='O'&&b[1].charAt(1)=='O'&&b[2].charAt(1)=='O')
             {
                 wino=1;
             }
             if(b[0].charAt(2)=='O'&&b[1].charAt(2)=='O'&&b[2].charAt(2)=='O')
             {
                 wino=1;
             }
             if(b[0].charAt(0)=='O'&&b[1].charAt(1)=='O'&&b[2].charAt(2)=='O')
             {
                 wino=1;
             }
             if(b[2].charAt(0)=='O'&&b[1].charAt(1)=='O'&&b[0].charAt(2)=='O')
             {
                 wino=1;
             }


             if(wino==1&&winx==1||x-o<0||x-o>1)
             {
                 System.out.println(3);
             }
             else if (x==0&&o==0&&n==9)
             {
                 System.out.println(2);
             }
             else  if(winx==1&&wino==0&&x>o)
             {
                 System.out.println(1);
             }
             else if(winx==0&&wino==1&&x==o)
             {
                 System.out.println(1);
             }
             else if(winx==0&&wino==0&&n==0)
             {
                 System.out.println(1);
             }
             else if (winx==0&&wino==0&&n>0)
             {
                 System.out.println(2);
             }
             else {
                 System.out.println(3);
             }

         }
         }




    }
