package Arrays;
public class ReverseArray {
    static void reverse(int arr[]){
        int first = 0;
        int end = arr.length-1;
        while (first < end){
            int temp ;
            temp  = arr[end];
            arr[end] = arr[first];
            arr[first] = temp ;
            first++ ;
            end-- ;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,56,6,87,8,90,5};
        reverse(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
