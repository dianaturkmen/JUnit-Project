package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_IlkTestMethodu {
    WebDriver driver;
    @Test
    public void test01(){
// amazon.com a gidelim veTitle in "amazon" icerdigini test edelim
       driver.get("https://amazon.com");
       String actualTitle= driver.getTitle();
       String arananKelime="amazon";
       if (actualTitle.contains(arananKelime)){
           System.out.println("amazon Passed");
       }else {
           System.out.println("amazon failed");

       }
    }

    @Test
    public void test02(){
// google.com a gidelim veTitle in "google" icerdigini test edelim
        driver.get("https://www.google.com");
        //3- cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        String actualTitle= driver.getTitle();
        String arananKelime="google";
        if (actualTitle.contains(arananKelime)){
            System.out.println("google Passed");
        }else {
            System.out.println("google failed");

        }
    }
    @Before
    public void ayarlariDuzenle(){
        WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void ortaligiTopla(){

    }

}
