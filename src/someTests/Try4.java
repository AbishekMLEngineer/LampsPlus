package someTests;

import org.testng.annotations.Test;

public class Try4 {
	String result = "";
	String reverse="Abishek";
	public String reverse(String str){
		if(str.length()==1){
			return str;
		}
		else{
			result += str.charAt(str.length()) +
					reverse(str.substring(0, str.length()-1));
			return result;
		}
			}
	//@Test
	public void trx(){
		Try4 obj = new Try4();
		obj.reverse("Abishek");
	}
	@Test
	public void reverseString(){
		char[] c = reverse.toCharArray();
		char[] che =new char[reverse.length()];

		for(int i =0;i>c.length;i++){
			che[i] =c[c.length-1];
		}
		for(char x:che){
			System.out.print(che);	
		}
		
	}
	

}
