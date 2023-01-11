package java_exercise;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);	
		 System.out.println("Enter the size of the array");
		 int a = scan.nextInt();
		 int[] arr = new int[a];
		 System.out.println("Enter the number in array");
		 for (int i = 0; i < arr.length; i++)	
		 {
			 arr [i]= scan.nextInt();
		 }
		 
//    System.out.println("array item is ---");
//    
//     for(int i = 0; i < arr.length; i++) {
//    	 
//    	 System.out.println(arr[i]);
    	 
    	 
		 System.out.println("Reverse array:");
         for(int i=arr.length-1;i>=0;i--)
         System.out.println(arr[i] + "  ");


	}

}
