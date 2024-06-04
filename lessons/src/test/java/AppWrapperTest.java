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
import static org.testng.Assert.assertTrue;

public class AppWrapperTest {
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

        WebElement inputPhone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        inputPhone.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        inputSum.sendKeys("100");
        WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        inputEmail.sendKeys("lesson8@aston.qa");
        WebElement buttonContinue = driver.findElement(By.cssSelector("#pay-connection > button"));
        buttonContinue.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("bepaid-iframe")));
        driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("pay-description__text")));
    }

    @AfterClass
    public void tearDown() {
        driver.switchTo().defaultContent();
        driver.quit();
    }

    @Test
    public void checkSum() {
        String sum = driver.findElement(By.className("pay-description__cost")).getText();
        assertEquals(sum, "100.00 BYN");
    }

    @Test
    public void checkPhoneNumber() {
        String phoneNumber = driver.findElement(By.className("pay-description__text")).getText();
        assertTrue(phoneNumber.contains("Номер:375297777777"));
    }

    @Test
    public void checkLogoGPay() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("gpay-card-info-placeholder-svg-container")));
        WebElement gPay = driver.findElement(By.className("gpay-card-info-placeholder-svg-container"));
        assertTrue(gPay.isDisplayed());
    }

    @Test
    public void checkLogoYaPay() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"ya-pay-button ya-pay-button_black\"]")));
        WebElement yaPay = driver.findElement(By.xpath("//button[@class=\"ya-pay-button ya-pay-button_black\"]"));
        assertTrue(yaPay.isDisplayed());
    }

    @Test
    public void checkSumOnButton() {
        WebElement button = driver.findElement(By.xpath("//button[@class=\"colored disabled\"]"));
        assertTrue(button.getText().contains("100.00 BYN"));
    }

    @Test
    public void checkTextOfInputCreditCard() {
        WebElement cardNumber = driver.findElement(By.xpath("//label[@class=\"ng-tns-c45-1 ng-star-inserted\"]"));
        String selectText = cardNumber.getText();
        assertEquals(selectText, "Номер карты");
    }

    @Test
    public void checkTextOfInputExpirationDate() {
        WebElement expirationDate = driver.findElement(By.xpath("//label[@class=\"ng-tns-c45-4 ng-star-inserted\"]"));
        String selectText = expirationDate.getText();
        assertEquals(selectText, "Срок действия");
    }

    @Test
    public void checkTextOfInputCVC() {
        WebElement cvc = driver.findElement(By.xpath("//label[@class=\"ng-tns-c45-5 ng-star-inserted\"]"));
        String selectText = cvc.getText();
        assertEquals(selectText, "CVC");
    }

    @Test
    public void checkTextOfInputHolder() {
        WebElement holder = driver.findElement(By.xpath("//label[@class=\"ng-tns-c45-3 ng-star-inserted\"]"));
        String selectText = holder.getText();
        assertEquals(selectText, "Имя держателя (как на карте)");
    }

    public static void main(String[] args) {

    }
}
