import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class PayWrapperTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mts.by");
        driver.manage().window().maximize();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.titleIs("МТС – мобильный оператор в Беларуси"));

        // принимаем обработку cookies
        WebElement cookieButton = driver.findElement(By.cssSelector("#cookie-agree"));
        cookieButton.click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testServicesConnection() {
        String title = driver.getTitle();
        assertEquals("МТС – мобильный оператор в Беларуси", title);
    }

    @Test
    public void testSelectText() {
        WebElement payWrapper = driver.findElement(By.className("select__now"));
        String selectText = payWrapper.getText();
        assertEquals(selectText, "Услуги связи");
    }

    @Test
    public void testPhoneFieldText() {
        WebElement phoneField = driver.findElement(By.id("connection-phone"));
        String placeholderText = phoneField.getAttribute("placeholder");
        assertEquals(placeholderText, "Номер телефона");
    }

    @Test
    public void testSumFieldText() {
        WebElement sumField = driver.findElement(By.id("connection-sum"));
        String placeholderText = sumField.getAttribute("placeholder");
        assertEquals(placeholderText, "Сумма");
    }

    @Test
    public void testemailFieldText() {
        WebElement emailField = driver.findElement(By.id("connection-email"));
        String placeholderText = emailField.getAttribute("placeholder");
        assertEquals(placeholderText, "E-mail для отправки чека");
    }

    public static void main(String[] args) {
    }
}
