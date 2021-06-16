import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laucch_browser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Sever\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://sit2-consumerism-wps.healthcare.nttdataservices.com/en/agent");
		System.out.println(d.getTitle());
		
	}
	
	
}
