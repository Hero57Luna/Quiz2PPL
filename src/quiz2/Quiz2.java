/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import static javax.management.Query.div;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Rahadian Adikusuma
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "D:\\Kuliah\\Semester 5\\PPL\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        String URL = "https://demo.1crmcloud.com/login.php";
        String currentURL = driver.getCurrentUrl();
        
        driver.get(URL);
        
        WebElement username = driver.findElement(By.id("login_user"));
        WebElement password = driver.findElement(By.id("login_pass"));
        
        username.sendKeys("admin");
        password.sendKeys("admin");
        
        WebElement button = driver.findElement(By.id("login_button"));
        button.click();
        
//        if(currentURL.equals("https://demo.1crmcloud.com/index.php")) {
//            WebElement button2 = driver.findElement(By.className("meta-profile"));
//            button2.click();
//        }

Thread.sleep(10000);
WebElement button2 = driver.findElement(By.className("meta-profile"));
button2.click();

        
     
    }
    
}
