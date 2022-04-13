package xpathAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutomateAmazon {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ga.khare\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        System.out.println("Title of the webpage: "+driver.getTitle());

        WebElement searchBox = driver.findElement(By.xpath("//div[@class=\"nav-search-field \"]/input[@id=\"twotabsearchtextbox\"]"));
        WebElement searchButton = driver.findElement(By.xpath("//span[@id=\"nav-search-submit-text\"]/input"));

        searchBox.sendKeys("Books");
        searchButton.click();

        Boolean result = driver.findElement(By.xpath("//span[@class=\"a-color-state a-text-bold\" and contains(text(),'Books')]")).isDisplayed();

        if(result)
        {
            System.out.println("Books searched successfully!!");
        }

        else
        {
            System.out.println("Oops! search operation failed");
        }

        List<WebElement> li = driver.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]"));

        System.out.println("First Book in the search results: "+li.get(0).getText());

    }
}

