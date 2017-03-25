
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++)
        	arr[i] = input.nextInt();
        
        
        while(arr.length>0){
        	if(status(arr,k))
        		System.out.println(arr.length);
        	else{
        		int temp = minimum(arr);
        		
        	}
        	
        	
        }
        
        
        
    }
    
    private static boolean status(int[] arr,int k){
    	boolean stat = true;
  for(int i =0;i<arr.length-1;i++){
       
      for(int j = i+1; j<arr.length;j++){
      if((arr[i] + arr[j])% k  != 0 )
      { stat = false;
      break;
      }
                                        }
  


  
  if(!stat)break;


  }
         return stat;
         }
    private static int minimum(int[] arr){
        int min = arr[0];
        for(int i =1; i<arr.length;i++){
      if(arr[i] < min)
          min  = arr[i];
        
        }
        return min;


 }
}