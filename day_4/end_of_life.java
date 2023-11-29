import java.util.*;

public class end_of_life {

    public static void main(String[] args) {
    
         Scanner scanner = new Scanner(System.in);   
       int n = 1;
       while (scanner.hasNext()){
           String line = scanner.nextLine();
           
           System.out.println(n + " " + line );
           n++;
       }
       scanner.close();
    }
}
