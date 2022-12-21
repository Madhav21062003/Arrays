package Arrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // syntax of Array :  datatype[] variableName = new datatype[size] ;  

        // creating an array and displaying their length
        int[] marks = new int[50];
        System.out.println("length of marks array is " + marks.length);

        int numbers[] = {1, 2, 3, 4, 5, 5};
        System.out.println("length of numbers array is " + numbers.length);

        int[] morNnumbers = {6, 6, 7, 8, 9, 92, 4, 56};
        System.out.println("length of moreNBumbers array is " + morNnumbers.length);

        String[] name = {"madhav", "prabal", "mayank"};
        System.out.println("length of name array is " + name.length);


        // Defination = An Array is a list of elements of same type stored at contigous memory location
    }
}

