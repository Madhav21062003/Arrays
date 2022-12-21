package Arrays;
public class printPairs {
    static void printPairs(int arr[]){
        int totalPairs = 0 ;           // formula for total pairs :  totalPairs = n*(n-1) / 2 ;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            for (int j = i+1; j < arr.length ; j++) {
                System.out.print("("+cur+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are: "+totalPairs);
    }
    public static void main(String[] args) {
              int num[] = {1,2,3,4,5,6,7};
        System.out.println("Total Pairs are : ");
              printPairs(num);
    }
}
