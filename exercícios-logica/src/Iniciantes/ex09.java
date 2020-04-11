package Iniciantes;

import java.util.Scanner;

public class ex09 {
	
	 public static int count(int num) {
	        int c=1;
	        while(num > 1) {
	       
	            if(num%2!=0) {
	                num = 3*num+1;
	            }else {
	                num=num/2;
	            }
	            c++;
	        }return c;
	    }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int x;
		
		int max = 10;
		 for(int i=1;i<=10;i++)
        
		 {
             if((x=count(i))>max) max = x;
         }

        System.out.println(x);
	}
}