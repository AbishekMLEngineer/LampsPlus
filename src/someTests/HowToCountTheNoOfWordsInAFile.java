package someTests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class HowToCountTheNoOfWordsInAFile {
	int count=0;
	@Test
	public static void findWordsCountInAFIle() throws FileNotFoundException{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner textFile = new Scanner(new File("E:\\Jmeter123\\Gonna.txt"));
		System.out.println("hee");
		while(textFile.hasNext()){
			String word = textFile.next();
			if(map.containsKey(word)){
				int count = map.get(word)+1;
			}
			else{
				map.put(word, 1);
			}
		}
		textFile.close();
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			System.out.println(entry);
		}
	}
	//@Test
	public void sendingFileToDifferentMethods(){
		String location = "E:\\Jmeter123\\Gonna.txt";
		/*try {
			//findWordsCountInAFIle(location);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}*/
	}
}  