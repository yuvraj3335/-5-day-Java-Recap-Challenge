

import java.util.*;

public class string_palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reversed = new StringBuilder(A).reverse().toString();
        
        if (reversed.equals(A)){
            System.out.println("Yes");
        } 
        else{
           System.out.println("No"); 
        }
    }
}



