package packone;

public class CallingReusableMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReusableMethods m = new ReusableMethods();
		m.launchApp();
		m.closeApp();
		m.launchAppWithArguments("http://facebook.com");
		m.elementAvaialble("email", true);
		m.elementAvaialble("pass", false);
		m.elementAvaialble("day", true);
		m.elementAvaialble("month", false);
		m.elementsCount("a", 50);
		m.elementsCount("img", 5);
		m.elementsCount("select", 3);
		m.closeApp();
		m.launchAppWithArguments("http://yahoo.com");
		m.elementsCount("img", 5);
		m.closeApp();
		
		

	}

}
