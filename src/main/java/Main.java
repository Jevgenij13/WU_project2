import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v105.input.Input;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.http.UrlTemplate;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

//Task 1 (Mandatory)
//        1. Navigate to https://www.westernunion.com/lt/en/home.html
//        2. Expand Burger menu
//        3. Select Settings page
//        4. Change WU.com Country to United States
//        5. Assert that correct country page was loaded.

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\J_Volynec\\chrome_driv\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            driver.get("https://westernunion.com/lt/en/home.html");


            WebElement cookie = driver.findElement(By.id("onetrust-reject-all-handler"));
            cookie.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



        WebElement header = driver.findElement(By.id("header-content"));
            WebElement mainMenu = driver.findElement(By.className("hamburger-button"));
            mainMenu.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//            Actions actions = new Actions(driver);
//            actions.moveToElement(mainMenu);
        WebElement subMenu = driver.findElement(By.xpath("//[@id=hamburger-nav-item]/ul/li[6]/a"));
//        actions.click().build().perform();
        subMenu.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement secMenu = driver.findElement(By.id("Question"));

        WebElement country = driver.findElement(By.name("United States"));
        country.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement button = driver.findElement(By.cssSelector("btn btn-primary mrg-top-0 mrg-btm-0 ng-isolate-scope"));
        button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = driver.getCurrentUrl()


//        Task 2 (Optional)
//                As a UAT tester using https://www.westernunion.com/lt/en/home.html
//        I want automation tool to search for open agent locations near my Zip code 08247
//        So that I could get address details of the first location printed in console


        public class Main {
            public static void main(String[] args) {
                System.setProperty("webdriver.chrome.driver","C:\\J_Volynec\\chrome_driv\\chromedriver_win32\\chromedriver.exe");
                ChromeDriver driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

                driver.get("https://westernunion.com/lt/en/home.html");

                WebElement cookie = driver.findElement(By.id("onetrust-reject-all-handler"));
                cookie.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
                WebElement header = driver.findElement(By.id("header-content"));
                WebElement mainMenu = driver.findElement(By.className("hamburger-button"));
                mainMenu.click();
                WebElement setting2 = driver.findElement(By.xpath("//[@id=hamburger-nav-item]/ul/li[1]/a"));
                setting2.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
                WebElement input = driver.findElement(By.xpath("//[@id=__next]/div[1]/main/form/div[2]/div/div[2]/div/div"));
                input.sendKeys("08247", Keys.ENTER);
                WebElement address = driver.findElement(By.cssSelector("wu_LocationCard___11ZSd"));
                String par = address.getText();
                System.out.println(par);






















        };






    };












