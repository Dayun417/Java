import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, sum=0;

        while (sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();

            sum = a+b;

            System.out.println(sum);
        }
    }
}