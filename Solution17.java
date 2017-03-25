import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
       String z = "";
       
       for(int i = 0; i<s.length();i++){
    	   if(97<=s.charAt(i) & s.charAt(i) <=122){
    		   int t = (int)s.charAt(i);
    		    t = 97 + ((t -97) + k) %26;
    		   z =z + (char)t;
    	   }
    	   else{
    	      if(65 <=s.charAt(i) & s.charAt(i)<=90){
    		   int t=(int)s.charAt(i);
    		   t = 65 + ((t -65) + k) %26;
    		   z = z + (char)t;
    		   
    		   
    	   }
    	   
    	   else{ 
    		   z = z + s.charAt(i);   
    	   }
    	   }
       }
    
    System.out.println(z);
    }
}
