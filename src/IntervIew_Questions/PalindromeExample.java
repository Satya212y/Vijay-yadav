package IntervIew_Questions;

import java.util.Scanner;

public class PalindromeExample{  
	 public static void main(String args[]){
		 Scanner s = new Scanner(System.in);
		 System.out.println("ENter Your Number Please");
		 int x= s.nextInt(),rem,rev=0;
		 int temp =x;
		 
		 while(temp>0) {
			 rem=temp%10; //7,3,1
			 rev=(rev*10)+rem;//7,731
			 temp=temp/10;//13,1
		 }
		 if(rev==x) {
			 System.out.println(x);
			 System.out.println(rev);
			 System.out.println("Pallindrome");
		 }else {
			 System.out.println("Not A PAllindrome");
             System.out.println(rev);
             System.out.println(x);
		 }
	
	} } 