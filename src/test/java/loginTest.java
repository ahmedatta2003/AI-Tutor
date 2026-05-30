import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://example.com/login");
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("12345");
        login.clickLogin();
        Thread.sleep(3000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
