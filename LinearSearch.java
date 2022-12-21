package Arrays;

import java.util.Objects;

public class LinearSearch {

    static int linearSearch(String key, String arr[]){
        for (int i = 0; i < arr.length ; i++) {
            if (Objects.equals(arr[i], key)) {
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         String arr[] = {"a","b","c", "g"};
         String key = "g" ;
        System.out.println(key+" is founf at index : "+linearSearch(key,arr));
    }
}
