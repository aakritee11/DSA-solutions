import java.util.Scanner;

public class Strings {

    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2;i++){
           int n = str.length();
           if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
           }
        }
        return true;
    }

    public static float shortestPath(String path){
        int x=0, y=0;
        for (int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir=='E'){
                x++;}
            else if(dir=='W'){
                x--;}
            else if(dir == 'N')
                y++;
            else
                y--;



        }
        int x2= x*x;
        int y2= y*y;
        return (float) Math.sqrt(x2+y2);
    }

    public static String substring(String str, int si, int ei){
        String substring = "";
        for(int i= si;i<ei;i++){
            substring += str.charAt(i);
        }
        return substring;
    }

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        
        String path = "WEENWSSE";

       System.out.print(substring(path, 0, 5));

    }
}
