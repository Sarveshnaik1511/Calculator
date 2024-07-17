package pom;

public class BasePage {
	public String removeWhiteSpace(String num) {
		String num1="";
		for(int i=0;i<num.length();i++) {
			if(num.charAt(i)==' ') {
				continue;
			}
			else {
				num1=num1+num.charAt(i);
			}
		}
		return num1;
	}
}
