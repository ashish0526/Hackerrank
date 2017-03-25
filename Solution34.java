import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        hour.put(1,"one");
        hour.put(2,"two");
        hour.put(3,"three");
        hour.put(4,"four");
        hour.put(5,"five");
        hour.put(6,"six");
        hour.put(7,"seven");
        hour.put(8,"eight");
        hour.put(9,"nine");
        hour.put(10,"ten");
        hour.put(11,"eleven");
        hour.put(12,"twelve");
        minutes.put(1,"one minute");
        minutes.put(2,"two minutes");
        minutes.put(3,"three minutes");
        minutes.put(4,"four minutes");
        minutes.put(5,"five minutes");
        minutes.put(6,"six minutes");
        minutes.put(7,"seven minutes");
        minutes.put(8,"eight minutes");
        minutes.put(9,"nine minutes");
        minutes.put(10,"ten minutes");
        minutes.put(11,"eleven minutes");
        minutes.put(12,"twelve minutes");
        minutes.put(13,"thirteen minutes");
        minutes.put(14,"fourteen minutes");
        minutes.put(15,"quarter");
        minutes.put(16,"sixteen minutes");
        minutes.put(17,"seventeen minutes");
        minutes.put(18,"eighteen minutes");
        minutes.put(19,"nineteen minutes");
        minutes.put(20,"twenty minutes");
        minutes.put(21,"twenty one minutes");
        minutes.put(22,"twenty two minutes");
        minutes.put(23,"twenty three minutes");
        minutes.put(24,"twenty four minutes");
        minutes.put(25,"twenty five minutes");
        minutes.put(26,"twenty six minutes");
        minutes.put(27,"twenty seven minutes");
        minutes.put(28,"twenty eight minutes");
        minutes.put(29,"twenty nine minutes");
        minutes.put(30,"half");
        
        if(m<=30 &m>0){
        	System.out.println(minutes.get(m)+" past "+hour.get(h)  );
        	
        }
        if(m>30 ){
        	System.out.println(minutes.get(60-m)+" to "+hour.get(h+1));
        }
        if(m==0){
        	System.out.println(hour.get(h)+ " o' clock");
        }
    }
    
    
  private static  HashMap<Integer,String> hour = new HashMap<Integer,String>();
  private static  HashMap<Integer,String> minutes = new HashMap<Integer,String>(); 
    
}

