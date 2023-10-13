public class ForMaxInArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 50, 6},
                {7, 8, 10}
        };
        int max = Integer.MIN_VALUE;
      //using for each loop to traverse in the arrays  
      for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        System.out.println(max);
    }
}
