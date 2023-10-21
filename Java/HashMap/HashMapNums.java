/*Given an integer array of size n, find all elements that apear more than  (n/2) times */
package HashMap;
import java.util.*;

public class HashMapNums {
    public static void majortiyElement(int nums[]){
        HashMap<Integer,Integer> map = new HashMap<>(); //HasMap initialisation
        int n = nums.length;

        for(int i =0 ; i<n ; i++){ //taversing along the array
            if(map.containsKey(nums[i])){ //true //checking the number is exists or not
                map.put(nums[i],map.get(nums[i])+1);
            }else{ // false
                map.put(nums[i],1);
            }   
        }
        for(int key : map.keySet()){
            if(map.get(key)>n/3)
            System.out.println(key);
        }
    }
    public static void main(String args[]){
        // int nums [] = {1,3,2,5,1,3,1,5,1}; //1
        int nums [] = {1,2}; //1,2
        majortiyElement(nums);

    }
}
