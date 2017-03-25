
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution21 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String[]  p = new String[n];
    int[] counter = new int[n];
    for(int i = 0; i<n;i++ ){
    	p[i] = input.next();
    	
    	int j = 0;
    	while(j<p[i].length()){
    		int t =1;
    		if(j + t < p[i].length()){
    		while(p[i].charAt(j) == p[i].charAt(j+t)  ){
    			t++;
    			counter[i]++;
    			if(j+t >= p[i].length())
    				break;
    			
    		}
    		}
    		j = j+t;
    		
    		
    		
    	}
    }
    
   for(int i= 0; i<n;i++){
	   System.out.println(counter[i]);
   }
    
    
    
    input.close();
    }
}