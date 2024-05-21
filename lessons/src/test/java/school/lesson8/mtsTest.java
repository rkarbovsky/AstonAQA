package school.lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class mtsTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "lessons/src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");

        // отклоняем обработку куки
        WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        cookieButton.click();

        // 1. Проверить название указанного блока;
        WebElement sectionPay = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        String sectionTitle = sectionPay.getText().replace("\n", " ");
        System.out.println("Название блока: " + sectionTitle);

        // 2. Проверить наличие логотипов платёжных систем;
        List<WebElement> logos = driver.findElements(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li/img"));
        for (int i = 0; i < logos.size(); i++) {
            if (logos.get(i).isDisplayed()) {
                String logo = logos.get(i).getAccessibleName();
                System.out.println("Логотип " + logo + " отображается");
            }
        }

        // 3. Проверить работу ссылки «Подробнее о сервисе»;
        WebElement link = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));
        link.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (driver.getTitle().equals("Порядок оплаты и безопасность интернет платежей")) {
            System.out.println("\nПереход по ссылке произошел успешно");
        } else {
            System.out.println("\nПереход по ссылке не произошел или заголовок страницы не соответствует ожидаемому");
        }
        driver.get("https://www.mts.by/");

        // 4. Заполнить поля и проверить работу кнопки «Продолжить» (проверяем
        // только вариант «Услуги связи», номер для теста 297777777)
        WebElement inputPhone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        inputPhone.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        inputSum.sendKeys("100");
        WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        inputEmail.sendKeys("lesson8@aston.qa");
        WebElement buttonContinue = driver.findElement(By.cssSelector("#pay-connection > button"));
        buttonContinue.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement modalWindow = driver.findElement(By.xpath("/html/body/div[8]"));
        if (modalWindow.isDisplayed()) {
            System.out.println("\nКнопка работает");
        } else System.out.println("\nКнопка не работает либо ввели неверные данные");

        driver.get("https://www.mts.by/");
        driver.quit();
    }
}
