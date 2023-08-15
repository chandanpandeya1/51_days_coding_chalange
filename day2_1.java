import java.io.*;
import java.util.*;
import java.math.*;

public class day2_1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        
        BigInteger a = new BigInteger(scn.nextLine());
        BigInteger b = new BigInteger(scn.nextLine());
        
        System.out.println(a.add(b)+"\n" + a.multiply(b));
    }
}
