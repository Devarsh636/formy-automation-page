import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ruchit/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownBtn = driver.findElement(By.id("dropdownMenuButton"));
        dropDownBtn.click();

//        WebElement autocompleteOption = driver.findElement(By.id("autocomplete"));
//        WebElement autocompleteOption = driver.findElement(By.xpath("/html/body/div/div/div/a[12]"));
        WebElement autocompleteOption = driver.findElement(By.cssSelector("div.show a[href='/scroll']"));

        autocompleteOption.click();
        driver.quit();
    }
}
