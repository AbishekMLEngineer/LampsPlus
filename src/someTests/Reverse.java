package someTests;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Reverse {
	@SuppressWarnings("null")
	@Test
	public void reverse(){
		List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("this is "+numbers.get(0));
        List<Integer> list = numbers.subList(1, 4);
        System.out.println(list);
        //print the sum in here 
        System.out.println(sumListRecursive(numbers));
    }
	
	 public static int sumListRecursive(List<Integer> numbers) {
	     System.out.println("Hilel");   
		 if (numbers.isEmpty() == true ) {
	            return 0;
	        }
	        else {
	            /* removed the print statement from here as it prints each time the function is called and else is executed. */
	            return numbers.get(0) + sumListRecursive(numbers.subList(1, numbers.size()));
	        }
}
}