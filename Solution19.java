import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution19 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
   
    	/* String s = "absd";
    String  p = new StringBuffer(s).reverse().toString();
    System.out.println(p);
    */
   
   Scanner input = new Scanner(System.in);
   int t = input.nextInt();
   
   for(int i =0; i<t;i++){
   String s = input.next();
   if(funnyCheck(s))
	   System.out.println("Funny");
   else
	   System.out.println("Not Funny");
    
    }
    
    input.close();
    
    }
    private static boolean funnyCheck(String p){
    	String q = new StringBuffer(p).reverse().toString();
    	for(int i = 1; i<p.length();i++){
    		if(absolute((int)p.charAt(i),(int) p.charAt(i-1)) != absolute((int)q.charAt(i),(int)q.charAt(i-1))){
    			return false;
    		}
    			
    		
    		
    	}
    	return true;
    }
    
    private static int absolute(int a,int b){
    	if(a>b)
    		return a-b;
    	else
    		return b-a;
    	
    }
}