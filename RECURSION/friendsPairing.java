import java.util.Scanner;

public class friendsPairing {
    public static int friendsPAiring(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPAiring(n-1)+ (n-1)*friendsPAiring(n-2);
    }

    public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
          int ways=  friendsPAiring(n);
        System.out.print(ways);
    }
}
