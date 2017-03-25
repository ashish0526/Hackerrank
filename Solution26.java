
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution26 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in);
    int q = input.nextInt();
    for(int i=0;i<q;i++){
    	int result =0  ;
    	String p = input.next();
    	if( p.length() %2 == 1){
    		result = -1;
    		
    		
    		
    	}
    	else{
    		String p1="";
    		String p2="";
    		for(int j= 0;j<=(p.length()-1)/2;j++ ){
                  			
    			p1 = p1+ p.charAt(j);
    		}
    		for(int j=(p.length()-1)/2 + 1; j<p.length();j++){
    			p2 = p2+ p.charAt(j);
    		}
    		for(int j=0; j<p1.length();j++){
    			if(p2.indexOf(p1.charAt(j)) ==-1 ){
    				result = result+1;
    			}
    			
    			
    		}
    		
    	}
    		
    	System.out.println(result);
    	
    	
    }
    input.close();
    
    }
}