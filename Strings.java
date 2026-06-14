import java.util.Arrays;
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

     public static String largestString (String sn[]){
       String largest = sn[0];
       for(int i=0;i<sn.length;i++){
        if(largest.compareTo(sn[i])<0){
            largest = sn[i];
        }
       }
        return largest;
     }

       public static String toUpperCase (String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i< str.length();i++){
          if(str.charAt(i)==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
          }else{
            sb.append(str.charAt(i));
          }
        }
        return sb.toString();

     }

     public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
        }
        return newStr;
     }

     public static int vowelCount(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
           String vowels = "aeiou";
           for(int j=0;j<vowels.length();j++){
            if(str.charAt(i)==vowels.charAt(j)){
                count++;
            }
           }
        }
        return count;
     }

      public static void isAnagrams(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char [] str1charArray = str1.toCharArray();
            char [] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(str1+" and "+ str2+" are anagrams");
            }else{
                System.out.println(str1+" and "+ str2+" are not anagrams");
            }

        }
        else{
            System.out.println(str1+" and "+ str2+" are not anagrams");
        }

     }

    public static void main(String args[]){
        String path = "WEENWSSE";
        String snacks[] = {"apple","kurkure", "momo", "avocado"};
       
        String str1 = "heart";
        String str2 = "earthy";
        isAnagrams(str1, str2);
     


    }
}
