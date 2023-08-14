public class MutualRecursion {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(num+" is a "+even(num)+" number");
    }
    
    public static String even(int num) {    
        if(num == 0)
            return "even";
        else
            return odd(num-1);
    }

    public static String odd(int num) {
        if(num == 0)
            return "odd";
        else
            return even(num-1);
    }
}
