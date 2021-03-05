
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/skaladagi/Desktop/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://spree-vapasi.herokuapp.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.findElement(By.className("nav-link")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("skaladagi@yahoo.com");
        driver.findElement(By.name("spree_user[password]")).sendKeys("selenium123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        //driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".info")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        Thread.sleep(5000);
        //driver.findElement(By.cssSelector(".nav-link")).click();
        //driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.partialLinkText("My")).click();

        //driver.findElement(By.xpath("//a[text()='Logout']")).click();
        driver.quit();

    }
}
