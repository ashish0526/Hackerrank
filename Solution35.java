import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int noOfChocolates = n/c;
            int counter = noOfChocolates; 
           int  noOfmorechocolates = noOfChocolates/m;
          counter=counter+ noOfmorechocolates ;
        while(noOfmorechocolates>=m){
        	noOfmorechocolates = noOfmorechocolates/m;
        	counter+=noOfmorechocolates ;
        	
        }
           counter+= noOfmorechocolates%m;
        System.out.println(counter);
        
        }
    }
}
