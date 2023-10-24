package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class _20_TestSample_mitGrid {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox"); // Tarayıcı türünü seçebilirsiniz (örneğin, "chrome", "firefox" vb.)

        // Hub URL'sini ayarlayın (hub, Selenium Grid hub'ınızdaki adres olmalıdır)
        URL hubUrl = new URL("http://localhost:4444/wd/hub"); // Hub adresini buraya ekleyin

        // Uzak sürücüyü başlatın
        RemoteWebDriver driver = new RemoteWebDriver(hubUrl, capabilities);


        // And now use this to visit Google
        driver.get("http://www.google.com");

        // Find the text input element by its name
        driver.findElement(By.id("L2AGLb")).click();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese");
        Thread.sleep(3000);

        // Now submit the form
        //element.submit();

        //Close the browser
        driver.quit();
    }
}
