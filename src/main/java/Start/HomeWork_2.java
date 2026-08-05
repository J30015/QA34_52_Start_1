package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomeWork_2 {
    WebDriver driver = new ChromeDriver() ;
    @Test
    public void ilcarroTests(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        WebElement btnFaceBook = driver.findElement(By.xpath("//div/a[@href='https://www.facebook.com/']"));
        btnFaceBook.click();
        pause(3000);
        driver.navigate().back();
        WebElement vKontakte= driver.findElement
                (By.xpath("//div[@class='social-networks']/a[@href='https://vk.com/']"));
        vKontakte.click();
        pause(3000);
        driver.navigate().back();
        WebElement btnTelegram = driver.findElement(By.xpath("//i[@class='icon-telegram']"));
        btnTelegram.click();
        pause(3000);
        driver.navigate().back();
        WebElement numberTelephon = driver.findElement(By.xpath("//a[@class='telephone']"));
        System.out.println(numberTelephon.getText());
        WebElement textCity = driver.findElement(By.xpath("//div/input[@id='city']"));
        textCity.sendKeys("London");
        pause(3000);
        WebElement textDates = driver.findElement(By.xpath("//div/div//input[@id='dates']"));
        textDates.sendKeys("8-4-2026");
        pause(3000);
        WebElement map = driver.findElement(By.xpath("//a[@class='address']"));
        map.click();
        pause(3000);
        driver.navigate().back();
        System.out.println(map.getText());

WebElement paris = driver.findElement(By.xpath("//div//a[@href='search/results?city=Paris']"));
        paris.click();
        pause(3000);
        driver.navigate().back();
        WebElement logIn = driver.findElement(By.xpath("//div[@class='page-links']/a[5]"));
        logIn.click();
        pause(3000);
        driver.navigate().back();
        WebElement signUp = driver.findElement(By.xpath("//a[@href='/registration?url=%2Fsearch']"));
        signUp.click();
        pause(3000);


        WebElement btnJoin = driver.findElement
                (By.xpath("//div[@class='action-container']/a[@href='login']"));
        btnJoin.click();
        pause(3000);

        driver.navigate().refresh();
        WebElement title = driver.findElement
                (By.xpath("//div[@class='title']"));
        System.out.println(title.getText());
        pause(3000);
        WebElement footerText = driver.findElement
                (By.xpath("//div[@class='footer-container' ]/span [@class='description']"));
        System.out.println(footerText.getText());
        driver.navigate().refresh();
        WebElement titleFeedBack = driver.findElement
                (By.xpath("//div[@class='feedback-container']/span[@class='title']"));
        System.out.println(titleFeedBack.getText());
        driver.navigate().refresh();






        driver.quit();
    }
    public void scrollActions(){
        Actions actions = new Actions(driver);
        for (int i = 0; i < 5; i++) {
            actions.scrollByAmount(0, 700).perform();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
