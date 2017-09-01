package someTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class WordCount {
	//@Test
	public void countingTheNoOfDuplicateWords() throws FileNotFoundException{
		HashMap< String, Integer> map = new HashMap<String, Integer>();
		Scanner txtfile = new Scanner(new File("E:\\AggregateReport\\try.txt"));
		while(txtfile.hasNext()){
			String word = txtfile.next();
			if(map.containsKey(word)){
				int count = map.get(word) +1;
				map.put(word, count);
			}
			else{
				map.put(word, 1);
			}
		}
		txtfile.close();
		
		for(Map.Entry<String,Integer> entry :map.entrySet()){
			System.out.println(entry);
		}
	}
	@Test
	public void countingTheNoOfDuplicateWords2() throws Exception{
		File file = new File("E:\\AggregateReport\\try.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fis);
		BufferedReader reader = new BufferedReader(input);
		String line=null ;
		Boolean b1 = true;
		 int countWord = 0;
	        int sentenceCount = 0;
	        int characterCount = 0;
	        int paragraphCount = 1;
	        int whitespaceCount = 0;
	        while((line= reader.readLine())!=null){ 
	        	if(line.equals("")){
	        		paragraphCount++;
	        	}
	        	if(!(line.equals(""))){
	        		characterCount+=line.length();
	        	}
	        	
	        }
	        System.out.println(paragraphCount);
	}
	
}
