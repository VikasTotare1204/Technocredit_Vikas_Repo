package util;
public class Demo {

	enum Browser{
		FIREFOX, CHROME, IE, safari;
	}
	public void selectBrower(Browser input){
		if(input.equals(Browser.FIREFOX)){
			
		}else if(input.equals(Browser.CHROME)){
			
		}
	}
	public void m1(){
		selectBrower(Browser.CHROME);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
	}
}
