import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution33 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            arr[A_i] = in.nextInt();
        }
     boolean condition = false;   
       for( int k = 1; k<n;k++){
        for(int i =0; i<n;i++){
        	if(i + k <n){
        	if(arr[i] == arr[i+k]){
        		System.out.println(Math.abs(k));
        	    condition = true;
        		break;
        	    
        	    
        	}
        }
        }
        
        if(condition)break;
        
        
       
        
    }
       if(!condition)
    	   System.out.println("-1");
    }
    }

