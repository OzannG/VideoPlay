package test.java;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VideoplayVerify {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.724dinle.com/");
        driver.findElement(By.cssSelector(".menu-sprite.music-icon")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//a[@class='podcast-img-view'])[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//a[@class='podcast-img-view'])[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".ux-btns-sprite.listen-icon.play_all")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".jp-controls.flex-item > .jp-play")).click();
        Thread.sleep(500);
        driver.findElement(By.cssSelector(".jp-controls.flex-item > .jp-play")).isDisplayed();

        driver.close();
        driver.quit();

    }
}
