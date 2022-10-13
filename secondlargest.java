package language.Java.Array;

public class secondlargest {
    public static void main(String[] args) {
        int a[] = { 0,-1,3,5,2};
        int max =Integer.MIN_VALUE;
        int secondMax = max;
        int min = a[0] ;
        for (int i = 0; i < a.length; i++) {
           if (max<a[i]) {
               secondMax = max;
               max = a[i];
           }
           else if (secondMax<a[i] && a[i]!= secondMax){secondMax =a[i];}

           else if( min>a[i]) min = a[i];

           

        }
        System.out.println("max :"+max);
        System.out.println("Second Max :"+secondMax);
        System.out.println("min :"+min);
    
    
    }
}
