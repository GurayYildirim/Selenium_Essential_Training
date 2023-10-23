package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _10_Datepicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateFeld = driver.findElement(By.id("datepicker"));
        dateFeld.sendKeys("03/03/2020");
        dateFeld.sendKeys(Keys.RETURN); // Es bedeutet, die „Enter“-Taste zu drücken.

        //driver.quit();
    }
}
