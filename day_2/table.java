
import java.io.*;


public class table {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
         int i;
        for (i=1; i<=10; i++){
            int x = N*i ;
            System.out.println(N + " x " + i + " = " + x);
}
        bufferedReader.close();
        
        
    }
}
