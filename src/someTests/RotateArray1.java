package someTests;


import java.util.Scanner;




@SuppressWarnings("resource")
public class RotateArray1 {
	int lengthofArray;
	int rotateBy;
	
	@org.testng.annotations.Test(priority=1)
	public  void maintest () {
		
		
		
		Scanner sc = new Scanner(System.in);
	    lengthofArray=sc.nextInt();
	    int[] arr = new int[lengthofArray];
		rotateBy= sc.nextInt();
		
		for(int i=0;i<lengthofArray;i++){
		   arr[i] = (int) sc.nextInt();
		}
		
		for(int x :arr){
			System.out.print(x+" ");
		}
		rotateArrayBytheparser(arr, rotateBy,lengthofArray);
		}
	
	public  int[] rotateArrayBytheparser(int[] arr, int d,int n){

		if(d>=lengthofArray){
			d=d%lengthofArray;
		}
		if(d==0){
			return arr;
		}
		int[] temp = new int[n];
		for(int i =0;i<lengthofArray;i++){
			if((i+d)<n){
				temp[i] = arr[i+d];
			}
			else{
				temp[i] = arr[(i+d)-n];
			}
			
		}
		
		
		
		return arr;
		
		
	}
	
	

}
