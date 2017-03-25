import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution41 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            boolean condition = false;
            boolean condition2 = false;
            for(int i =0; i<R;i++){
            	if(G[i].contains(P[0])){
            		condition = true;
            	int temp =G[i].indexOf(P[0]);
            	condition2 = true;
            	
            	for(int j=i+1;j<r;j++){
                 if(!(P[j].equals(G[j].substring(temp,temp+r)))){
                	 condition = false;
                 }
            		
            		
            	}
            	
            	}
            	if(condition){
            		System.out.println("Yes");
            		condition2 = true;
            		break;
            	}
            }
            
            if(!condition)
            	System.out.println("No");
            
        }
    }
}
