import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, sum=0;
        n = sc.nextInt();

        for(int i=1;i<=n;i++) {
            sum += i;
        }
        System.out.println(sum); 
    }
}