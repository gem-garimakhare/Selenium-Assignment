package mouseAndKeyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Assignment13thApril2022 {
    public  static void main(String[] args) throws InterruptedException {
        //setting the system property to value named webdriver.chrome.driver and the path is given to get the chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ga.khare\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //creating an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        //maximising browser
        driver.manage().window().maximize();

        //navigating to particular url
        driver.get("https://www.facebook.com/");

        //fetching create acc button
        WebElement createNewAcc = driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]"));

        //creating an instance of Actions class
        Actions action = new Actions(driver);

        //clicking on the create acc button
        action.moveToElement(createNewAcc).click().build().perform();

        Thread.sleep(5000);

        //fetching first name input field of signup form
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"fullname_field\"]//input[@name=\"firstname\"]"));

        //sending data to firstname input and also copying that
        action.moveToElement(firstName).keyDown(Keys.SHIFT).sendKeys("j").sendKeys("o").sendKeys("e").keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

        //fetching surname input field of signup form
        WebElement surName = driver.findElement(By.xpath("//*[@id=\"fullname_field\"]//input[@name=\"lastname\"]"));

        //right click on surname field to paste the copied data
        action.moveToElement(surName).contextClick().build().perform();
        Robot robot = null;
        try {
            //creating an instance of Robot class
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        //moving cursor down to paste option from the context menu
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);


        Thread.sleep(20000);

        //fetching mobile number input field of signup form
        WebElement mobileNumber = driver.findElement(By.xpath("//*[@name=\"reg_email__\"]"));
        //sending data to mobile number input field
        action.sendKeys(mobileNumber,"1234567891").build().perform();

        Thread.sleep(20000);

    }
}
