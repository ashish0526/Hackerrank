
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
       
    	
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	int[] arr = new int[n];
    	for(int i =0; i<n;i++){
    	arr[i] = input.nextInt();
    	}
    	
    	for(int i =0; i<n;i++){
    		
    		for(int j = 0; j<n;j++){
    		
    			
    			if(arr[arr[j]-1]== i+1)
    				{System.out.println(j+1);
    			  break;
    				}
    			
    		}
    	}
    }
}
