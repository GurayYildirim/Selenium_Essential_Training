package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _12_FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadFeld = driver.findElement(By.id("file-upload-field"));
        fileUploadFeld.sendKeys("test/file-to-upload.png");



        //driver.quit();
    }
}
