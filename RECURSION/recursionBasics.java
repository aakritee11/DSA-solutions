import java.util.*;
public class recursionBasics{
    public static void printDec(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
System.out.print(n+" ");
printDec(n-1);

    }

    public static void printInc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
      printInc(n-1); 
      System.out.print(n+" ");
      
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fact= 1;
        fact = n * factorial(n-1);
        return fact;
    }

    public static int sumOffirstN(int n){
        if(n==0){
            return 0;
        }
        int sum= 0;
        sum = n + sumOffirstN(n-1);
        return sum;
    }

    public static  void main(String[] args){
//    printDec(9);
// System.out.print(factorial(5));
//    printInc(9);    
System.out.print(sumOffirstN(10));
}
}