
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution37 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int k = input.nextInt();
      int counter = 0;
      int page = 1;
     
      for(int i =0; i<n;i++){
    	  
    	  int t  =  input.nextInt();    	  
    	  for(int temp =1;temp<=t;temp++){
    		  if(temp == page)counter++;
    		  
    		  if(k==1|temp == t|temp%k== 0)page++;
    	  }
      }
      
      
      System.out.println(counter);
      
    }
}