import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WebTest {

    @Test
    public void testMenuStartTitle(){

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Program Files\\JetBrains\\chromedriver_win32(1)\\chromedriver.exe";
        String url = "https://99-bottles-of-beer.net";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver,driverPath );
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement
                (By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']"));
        menuBrowseLanguages.click();

        WebElement menuStart = driver.findElement
                (By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li[1]/a[1]"));
        menuStart.click();

        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = h2.getText();

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }
    //Подтвердите, что на странице по базовой ссылке в правом верхнем углу пользователь видит заголовок
    // 99 Bottles of Beer
    //Шаги:
    //1. Открыть вебсайт на базовой странице
    //2. Считать заголовок в правом верхнем углу
    //3. Подтвердить, что текст заголовка соответствует ожидаемому
    //4. Закрыть браузер
    @Test
    public void headerOfPage(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Program Files\\JetBrains\\chromedriver_win32(1)\\chromedriver.exe";
        String url = "https://99-bottles-of-beer.net";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver,driverPath );
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement h1 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='header']/h1"));
        String actualResult = h1.getText();

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }
    //Подтвердите, что на странице по базовой ссылке последний пункт меню называется Submit new Language
    //Шаги:
    //1. Открыть вебсайт на базовой странице
    //2. Считать название последнего пункта меню
    //3. Подтвердить, что название последнего пункта меню соответствует ожидаемому
    //4. Закрыть браузер
    @Test
    public void TestMenuSubmitNewLanguageTitle(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Program Files\\JetBrains\\chromedriver_win32(1)\\chromedriver.exe";
        String url = "https://99-bottles-of-beer.net";
        String expectedResult = "Submit new Language";

        System.setProperty(chromeDriver,driverPath );
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement MenuLastTitle = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='" +
                        "/submitnewlanguage.html']")
        );
        String actualResult = MenuLastTitle.getText();

        Assert.assertEquals(actualResult,expectedResult.toUpperCase());

        driver.quit();
    }
    //Подтвердите, что на странице по базовой ссылке последний пункт меню имеет подзаголовок Submit new Language
    //Шаги:
    //1. Открыть вебсайт на базовой странице
    //2. Нажать на пункт меню Submit new Language
    //3. Считать название подзаголовка последнего пункта меню
    //4. Подтвердить, что название подзаголовка последнего пункта меню соответствует ожидаемому
    //5. Закрыть браузер
    @Test
    public void TestMenuSubmitNewLanguageSubmenuTitle(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Program Files\\JetBrains\\chromedriver_win32(1)\\chromedriver.exe";
        String url = "https://99-bottles-of-beer.net";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver,driverPath );
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement SubmitNewLanguage = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='" +
                                "/submitnewlanguage.html']")
        );
        SubmitNewLanguage.click();

        WebElement SubmitNewLanguageSubmenuTitle = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='." +
                        "/submitnewlanguage.html']")
        );
        String actualResult = SubmitNewLanguageSubmenuTitle.getText();
        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }
    //Подтвердите, что на странице по ссылке http://www.99-bottles-of-beer.net/abc.html , первый пункт подменю
    // называется 0-9
    //Шаги:
    //1. Открыть вебсайт на странице
    //2. Считать название первого подзаголовка
    //3. Подтвердить, что название подменю соответствует ожидаемому
    //4. Закрыть браузер
    @Test
    public void TestMenuSubmitBrowseLanguageSubmenuTitle0_9(){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "C:\\Program Files\\JetBrains\\chromedriver_win32(1)\\chromedriver.exe";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver,driverPath );
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement BrowseLanguageSubmenuTitle0_9 = driver.findElement(
                By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='0.html']")
        );

        String actualResult = BrowseLanguageSubmenuTitle0_9.getText() ;
        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }
    //Подтвердите, что имена создателей сайта:
    //Oliver Schade
    //Gregor Scheithauer
    //Stefan Scheler
    //
    //Шаги:
    //1.Open website on the main page
    //2.Click on submenu title "team"
    //3.Validate names of the team members
@Test
public void TeamMembersNames() throws InterruptedException {

    String chromeDriver = "webdriver.chrome.driver";
    String driverPath = "C:\\Program Files\\JetBrains\\chromedriver_win32(1)\\chromedriver.exe";
    String url = "http://www.99-bottles-of-beer.net";
    String expectedResult1 = "Oliver Schade";
    String expectedResult2 = "Gregor Scheithauer";
    String expectedResult3 = "Stefan Scheler";


    System.setProperty(chromeDriver,driverPath );
    WebDriver driver = new ChromeDriver();

    driver.get(url);

    WebElement  TestMenuStartSubmenuTeam= driver.findElement(
            By.xpath("//body/div[@id='wrap']/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']")
    );
    TestMenuStartSubmenuTeam.click();

    WebElement TeamMember1 = driver.findElement(
            By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[contains (text(),'Oliver Schade')]")
    );
    String actualResult1 = TeamMember1.getText() ;
    Assert.assertEquals(actualResult1,expectedResult1);

    WebElement TeamMember2 = driver.findElement(
            By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[contains( text(),'Gregor Scheithauer')]")
    );
    String actualResult2 = TeamMember2.getText();
    Assert.assertEquals(actualResult2,expectedResult2);

    WebElement TeamMember3 = driver.findElement(
            By.xpath("//body/div[@id='wrap']/div[@id='main']/h3[contains( text(),'Stefan Scheler')]")
    );
    String actualResult3 = TeamMember3.getText();
    Assert.assertEquals(actualResult3,expectedResult3);

    driver.quit();
    }

}


