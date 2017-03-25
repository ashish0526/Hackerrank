
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long  total = 0;
       long k = n/s.length();
        int noOfAs = 0;
       for(int i   = 0; i<s.length();i++){        
    	  if(s.charAt(i) == 'a')
    		  noOfAs++;
      }
       total = total+ k*noOfAs;
       long remainder = n%s.length();
       for(int i = 0; i<remainder;i++){
    	   if(s.charAt(i) =='a')
    		   total++;
       }
    
      System.out.println(total);
    
    }
}
