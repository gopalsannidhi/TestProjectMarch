package day4;

public class DemoWorkingWithChrome {

	public static void main(String[] args) {
	WorkWithChrome wc = new WorkWithChrome();
	
	wc.invokeBrowser();
	wc.navigateCommands();
	System.out.println(wc.getTitle());
	wc.closeBrowser();


	}

}
