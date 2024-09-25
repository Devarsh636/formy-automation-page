import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Ruchit/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        // Enter first name text field in the form
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("John");

        // Enter last name text field in the form
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Wick");

        // Enter job title text field in the form
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Software Developer");

        // Select radio button by id
        WebElement highestEduLevel_Grad = driver.findElement(By.id("radio-button-3"));
        highestEduLevel_Grad.click();

        // Select checkbox by id
        WebElement sexCheckbox_male = driver.findElement(By.id("checkbox-1"));
        sexCheckbox_male.click();


        // This element is for exp yrs where dropdown menu will occur
        WebElement expYrs = driver.findElement(By.id("select-menu"));
        expYrs.click();

        WebElement oneYrsExp = driver.findElement(By.cssSelector("#select-menu option[value='1']"));
        oneYrsExp.click();


        // Insert today date in mm/dd/yyyy format
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("09/25/2024");
        datePicker.sendKeys(Keys.RETURN);


        // Submit the button and navigate to thank you page
        WebElement submitForm = driver.findElement(By.cssSelector("a[role='button'][href*='thanks']"));
        submitForm.click();

        driver.quit();
    }
}
