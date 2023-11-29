import java.util.*;


public class  java_hashset  {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        s.close();
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> sets = new HashSet<String>();
        for(int i=0;i<t;i++){
           sets.add(pair_left[i]+ " " + pair_right[i]);
            System.out.println(sets.size());
        }



    }
}