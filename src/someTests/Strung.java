package someTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Strung {
	//@Test(priority=1)
	public void try12(){
		String str = "Abcdeghijkl";
		char[] helo = str.toCharArray();
		List<Character> trial= new ArrayList<>();
		for(char c:helo){
			trial.add(c);
		}
		Collections.reverse(trial);
		ListIterator<Character> li=trial.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}
		System.out.println();
		System.out.println(trial);
		System.out.println(Arrays.toString(helo));
		
		for(int i=1;i<str.length();i++){
			System.out.print(str.charAt(str.length()-i));
			
		}
		printrev("Abcdef");
	}
	
	static void  printrev(String st){
		for(int i=st.length()-1;i>0;i--){
			System.out.print(st.charAt(i));
		}
	}
	
	//@Test(priority=2)
	public void reverse2(){
		String stx ="hello";
		StringBuffer stf = new StringBuffer();
		System.out.println("helllllll");
		for(int x =stx.length()-1;x>=0;x--){
			System.out.print(stf.append(stx.charAt(x)));
		}
		System.out.println();
		System.out.println("reverse "+stf);
	}
	//@Test
	public void sendArguments(){
		Strung repeat = new Strung();
		int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.findingDuplicates(arr,arr_size);
        
		}
	
	public void findingNonDuplicates(int arr[], int arrsize){
		List<Integer> arrlist = new ArrayList<>();
		for(int i=0;i<arrsize;i++){
			for(int j =i+1;j<arrsize;j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[j]+" ");
				}
				
			}
		}
	}
	
	public void findingDuplicates(int arr[],int arrsize){
		Set<Integer> set1 = new HashSet<>();
		for(int i=0;i<arrsize;i++){
			if(set1.add(arr[i])==false){
				System.out.println(set1);
			}
		}
	}
//	@Test
	public void check(){
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java"};
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i].equals(names[j])){
					System.out.println(names[i]);
				}
			}
		}
	}
	public static int checkDuplicatesWithHashMap(int[] a){
		int n=a.length;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
		   if(map.containsKey(a[i])){
			int value=(int)((Integer)map.get(a[i]));
			value=value+1;
			map.put(a[i],value);
			return a[i];
		   }else{
			map.put(a[i],0);
		   }
		}
		return -1;
		}
	@Test 
	public void checkWithHashTable(){
		int[] arr1={0,3,2,2,1,5,6,7,9};
		   int[] arr2={0,3,3,1,5,6,7,9};
		int[] arr4={0,3,3,2,1,5,6,7,9};
			System.out.println(checkDuplicatesWithHashMap(arr4));
		 
		/**
		 * Check duplicates using list and set
		 */
		 
		 System.out.println(checkDuplicateUsingSet(arr1));
	}
	public static boolean checkDuplicateUsingSet(int[] a){
		List inputList = Arrays.asList(a);
		Set inputSet = new HashSet(inputList);
		if(inputSet.size()< inputList.size()){
		    return true;
		}
		return false;
		}
	
	
	
	
	

}
