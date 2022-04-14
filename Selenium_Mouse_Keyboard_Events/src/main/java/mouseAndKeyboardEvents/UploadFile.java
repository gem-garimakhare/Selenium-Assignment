package mouseAndKeyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ga.khare\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://smallseotools.com/plagiarism-checker/");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement fileUpload = driver.findElement(By.xpath("//input[@id='upload']"));
        fileUpload.sendKeys("C:\\Users\\ga.khare\\Downloads\\XPath Assignment.docx");
    }
}
