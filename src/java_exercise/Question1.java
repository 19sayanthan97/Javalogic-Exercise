package java_exercise;

public class Question1 {
	
	public static void main (String args[]) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
	    
		int total = 0;
	
		for(int i =0; i < arr.length; i++ )
		{
		
		total = total + arr[i];
			
		
		}
		
		double average = total/arr.length ;
		
		System.out.println("Average is:" + average);
		
	
		
		double sqDiff = 0;
        for (int i = 0; i < arr.length; i++) {
        
            sqDiff += (arr[i] - average) *
                      (arr[i] - average);
            
           		
	}
        
double sDeviation = sqDiff / arr.length;
        
        
        System.out.println("Standard Deviation: " + sDeviation);
        
        double squrerootOfSD = Math.sqrt(sDeviation);
        
        System.out.println("Squreroot of Standard Deviation is : " + squrerootOfSD);
        
        
        
        

}}
