
import java.util.Scanner;

public class substring_comparison {

    public static String getSmallestAndLargest(String s, int k) {
        String S = s.substring(0,k);
        String smallest = S;
        String largest = S;
        for (int i=1;i<=s.length()-k;i++ ){
            S = s.substring(i,i+k);
            if(S.compareTo(largest)>0){
                largest = S;
            }
            if(S.compareTo(smallest)<0){
                smallest = S;
            }
            
        }
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}