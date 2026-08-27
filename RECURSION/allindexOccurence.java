import java.util.Scanner;

public class allindexOccurence {
     public static int allOccurence(int arr[],int n, int i){
        if(i== arr.length){
            return 0;
        }
        if(arr[i]==n){
            System.out.println(i);
        }
        return allOccurence(arr, n, i+1);
    }

    public static void main(String args[]){
            
            int n = 2;
            int arr[]= {3,2,4,5,2,1,9,2};
        allOccurence(arr, n, 0);
    }
}
