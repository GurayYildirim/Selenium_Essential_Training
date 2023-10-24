package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.ConfirmationPage;
import pages.FormPage;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class _19_SubmitForm_Grid {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome"); // Tarayıcı türünü seçebilirsiniz (örneğin, "chrome", "firefox" vb.)

        // Hub URL'sini ayarlayın (hub, Selenium Grid hub'ınızdaki adres olmalıdır)
        URL hubUrl = new URL("http://localhost:4444/wd/hub"); // Hub adresini buraya ekleyin

        // Uzak sürücüyü başlatın
        RemoteWebDriver driver = new RemoteWebDriver(hubUrl, capabilities);

        // Web sayfasına gidin
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage=new FormPage();
        ConfirmationPage confirmationPage = new ConfirmationPage();

        formPage.submitForm(driver);
        confirmationPage.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBanner(driver));

        driver.quit();

    }


}

