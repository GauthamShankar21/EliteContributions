import java.util.Scanner;

/*
A prime number is a whole number greater than 1 whose only factors are 1 and itself. 
A factor is a whole number that can be divided evenly into another number. 
The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29. 
Numbers that have more than two factors are called composite numbers
*/




public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking user input
        System.out.print("Enter number to find its prime : "); 
        int n = sc.nextInt();

        //calling the Findprime and out put the results
        if(Findprime(n)==true){
            System.out.println(n+" isn't a prime number");
         }else{
            System.out.println(n+" is a prime number");
         }

        sc.close();
    }

    // we can't find input number is prime by direct what we doing here is search they have other factors than 1 and input number. 
    public static boolean Findprime(int y){
        int temp=y/2;
        for(int i=2;i<temp;i++){
           if((y%i)==0){
                return true;
           }
        }
        return false;
    }
//optimize version
      public static boolean Findprime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
//bute force
    static void findPrime(int n){  
  int i,m=0,flag=0;      
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
}  
    
}
