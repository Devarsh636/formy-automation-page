import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ruchit/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("206 Maniprabhu Appartment, Near Navrang Circle, Navrangpura, Ahmedabad");

        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.id("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
