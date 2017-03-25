
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long total = 0;
        
            if(absdifference(x,y) > z){
            	if(x > y){
            		total+= b*z + b*y;
            		total+=w*y;
            		
            	}
            	else
            	{
            		total+= w*z + w*x;
            		total+=b*x;
            		
            	}
            }
            	else{
            	total+=b*x + w*y;	
            		
            		
            		
            	}
            	
            	System.out.println(total);
            	
            
            
        
        }
        
       
        
        
    }
    
    private static long absdifference(long a,long b){
       if(a>b)
    	   return a-b;
       else return b-a; 
    		   
    }
}
