package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _11_Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown= driver.findElement(By.cssSelector(".btn.btn-primary.dropdown-toggle"));
        dropDown.click();

        WebElement autocompleteItem=driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();


        //driver.quit();
    }
}
