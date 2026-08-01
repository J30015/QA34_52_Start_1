package Start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home_work {
    WebDriver driver = new ChromeDriver();

    @Test
    public void HWTest() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        pause(2000);
        WebElement home=driver.findElement(By.cssSelector("a[class='active']")) ;
        home.click();
        pause(2000);
WebElement text = driver.findElement(By.cssSelector("h1") );
        System.out.println(text.getText());
        pause(2000);
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']") );
        btnAbout.click();
        pause(2000);
        WebElement btnAbout2 = driver.findElement(By.cssSelector(".active") );
        btnAbout2.click();
        pause(3000);
        System.out.println(btnAbout2.getTagName());
WebElement btnLogin = driver.findElement(By.cssSelector("div.navbar-component_nav__1X_4m a:last-child"));
btnLogin.click();
pause(3000);
WebElement fieldEmail = driver.findElement(By.cssSelector("div.login_login__3EHKB input[name='email']"));
fieldEmail.click();
pause(3000);
WebElement fieldPassword = driver.findElement(By.cssSelector("div.login_login__3EHKB input[name='password']"));
fieldPassword.click();
pause(3000);
WebElement backHome = driver.findElement(By.cssSelector("*[href='/home']") );
backHome.click();
pause(3000);
WebElement backLogin = driver.findElement(By.cssSelector("a[href='/login']"));
backLogin.click();
pause(3000);
WebElement clickLogin = driver.findElement(By.cssSelector("div.login_login__3EHKB button[name='login']"));
clickLogin.click();
pause(3000);
driver.quit();
    }
    @Test
    public void HWTest2()

    {
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        pause(2000);
        WebElement clickIlcarro = driver.findElement(By.cssSelector("div.header a.logo") );
        clickIlcarro.click();
        pause(3000);
        WebElement btn3 = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(3)"));
        btn3.click();
        pause(3000);
        WebElement pickUp = driver.findElement(By.cssSelector("div.input-container #pickUpPlace"));
        pickUp.click();
        pause(3000);
        WebElement termsOfUse = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(4)"));
        termsOfUse.click();
        pause(3000);
        WebElement signUp = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        signUp.click();
        pause(3000);
        WebElement logIn = driver .findElement(By.cssSelector("div.header a.navigation-link:last-child"));
        logIn.click();
        pause(3000);
        WebElement search = driver.findElement(By.cssSelector(" a[href='/search']"));
        search.click();
        pause(3000);
        WebElement join = driver.findElement(By.cssSelector("div.action-container a.login-btn"));
        join.click();
        pause(3000);
        WebElement footer = driver.findElement(By.cssSelector("div.footer-container"));
        footer.click();
        pause(3000);
        WebElement topCities = driver.findElement(By.cssSelector("div.top-cities"));
        topCities.click();
        pause(3000);
        driver.navigate().back();
        pause(3000);

        driver.quit();


    }


    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
