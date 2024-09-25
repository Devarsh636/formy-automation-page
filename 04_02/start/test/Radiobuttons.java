import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ruchit/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

//        driver.get("https://formy-project.herokuapp.com/radiobutton");
//
//        WebElement radioButton = driver.findElement(By.id("radio-button-1"));
//        radioButton.click();
//
//        WebElement radioButton2 = driver.findElement(By.cssSelector("[value='option2']"));
//        radioButton2.click();
//
//        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
//        radioButton3.click();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkboxBtn = driver.findElement(By.id("checkbox-1"));
        checkboxBtn.click();

        WebElement checkboxBtn2 = driver.findElement(By.cssSelector("[value='checkbox-2']"));
        checkboxBtn2.click();

        WebElement checkboxBtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        checkboxBtn3.click();

        Thread.sleep(1000);
        driver.quit();
    }
}
