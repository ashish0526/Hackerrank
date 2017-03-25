
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
       /* for(int t = 0; t<k;t++){
        	int temp = a[n-1];
        	for(int i =n-2; i>=0;i--){
        		a[i+1] = a[i];
        		
        	}
        	a[0] = temp;
        } 
        */
        
        
        int[] temp = new int[k];
        int counter = 0
        		;
       for(int i=n-1; i>=0;i--){
    	   
        	
        	if(i+k > n-1){
        		temp[(i+k)-(n)] = a[i];
        		counter++;
        	}
        	else
        		a[i+k] = a[i];
        	
        }
       for(int i = 0; i<counter;i++){
    	   a[counter-1-i] = temp[i];
       }
       
        /*for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
      System.out.println(a[m]);
      
        
        
        }*/
       for(int i =0; i<n;i++)
    	   System.out.println(a[i]);
       
       
    }
}
