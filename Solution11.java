
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            // your code goes here
            
            for(int i = 0; i<n;i++){
            	int max = M[i][0];
            	int index = 0;
            	for(int j= 1; j<n;j++){
            		if(M[i][j] > max){
            			max = M[i][j];
            		  index = j;
            		}
            	}
            	int total = 0;
            	for(int k = 0; k<n;k++){
            		if(k != i){
            			total+=M[k][index];
            			
            		}
            	}
            		q = q - total;
            		if(q < 0){
            			System.out.println("Impossible");
            		
            		break;
            		}
            		else if(i == n-1 && q >= 0){
            			System.out.println("Possible");
            			
            		}
            		else{
            			continue;
            		}
            		
            	
            	
            	
            	
            	
            }
        }
    }
}
