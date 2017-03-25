import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution32 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int d = input.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
    	arr[i] =  input.nextInt();
    }
    int counter = 0;
    for(int i =0; i<n-2;i++){
    	for(int j =i+1; j<n-1;j++){
    		for(int k=j+1;k<n;k++){
    			
    			if(arr[k] -arr[j] == d & arr[j] - arr[i] ==d)
    				counter++;
    			
    			
    			
    			
    		}
    	}
    }
    System.out.println(counter);
    
    }
}