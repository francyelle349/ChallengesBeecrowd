package challenge;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//beecrowd - 1013
public class TheGreatest {
    public static void main(String[] args) throws IOException{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];

        int a;
        int b;
        int c;

        input = obj.readLine().split(" ");

        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);

        int d = Math.max(a,b);
        int e = Math.max(d, c);
        System.out.println(e+" eh o maior");

    }
}
