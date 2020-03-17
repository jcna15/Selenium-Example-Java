import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckHomePage {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","D:\\SeleniumDriver\\geckodriver.exe");
        FirefoxDriver driver=new FirefoxDriver();
        //driver.get("http://demo.guru99.com/");
        //WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        //element.sendKeys("abc@gmail.com");
        //WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        //button.click();

        driver.get("http://newtours.demoaut.com/");
        //driver.manage().window().maximize();
    }
}
