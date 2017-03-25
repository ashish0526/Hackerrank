import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution38 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int max = 0;
        Arrays.sort(c);
        if(m<=n){
        for(int i=0; i<m-1;i++){
             for(int j=i+1; j<m;j++){ 
            	 if(c[j]  - c[i] >max)
             }
        		
        	
        }
        
        
        
        
       
        
        
        System.out.println(max/2);
        }
        if(n==m)
        	System.out.println("0");
        }
}
