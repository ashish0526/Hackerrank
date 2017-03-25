
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution39 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] grid = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
            
        }
           char[][] res = new char[n][n];
        for(int i=0;i<n;i++)
        {
            char[] ch=grid[i].toCharArray();
            for(int k=0;k<n;k++)
                {
                res[i][k]=ch[k];
            }
        }
       
        
        for(int i=1; i<n-1;i++){
        	for(int j=1;j<n-1;j++){
        		
        	if((res[i][j] > res[i-1][j] )&&(res[i][j] > res[i+1][j]) &&(res[i][j] > res[i][j+1])&&(res[i][j-1] > res[i][j]))
        		res[i][j] = 'X';
        	
        	
        }
    }
        
        for(int i=0; i<n;i++){
        	for(int j=0; j<n;j++)
        		System.out.print(res[i][j]);
           System.out.println();
        }
}
}