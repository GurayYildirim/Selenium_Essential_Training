package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_Radiobuttons {
    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radoButton1=driver.findElement(By.id("radio-button-1"));
        radoButton1.click();
        WebElement radoButton2=driver.findElement(By.cssSelector("input[value='option2']"));
        radoButton2.click();
        WebElement radoButton3=driver.findElement(By.cssSelector("input[value='option3']"));
        radoButton3.click();

        //driver.quit();
    }
}
