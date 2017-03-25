import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input  = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n];
    int[] brr = new int[101];
    
    for(int i =0; i<n;i++){
    	arr[i] = input.nextInt();
        brr[arr[i]]+=1;
    }
   
    int max = brr[0];
    int index = 0;
    for(int i =1; i<101;i++){
    	if(brr[i] > max){
    		max = brr[i];
    		index = i;
    		
    	}
    	
    }
    
    System.out.println(arr.length - max);
    
    }
}