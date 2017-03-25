
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution36 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
        
       int min = min(i,j,width);    
        System.out.println(min);
        
        }
        
        	
       
        	
        	
        
    }
    
    
    
    private static int min(int i,int j,int[] arr){	
    	int min  = arr[i];
    	for(int temp = i+1;temp<=j;temp++){
    		if(arr[temp]<min)
    			min = arr[temp];
    		
    	}
    	return min;
    }
    	
}
