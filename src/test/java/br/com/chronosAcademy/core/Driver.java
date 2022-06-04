package br.com.chronosAcademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver; // Static - Algo estático
    private static WebDriverWait wait;

    //Ele é construtor pq ele é public e tem o nome da classe
    public Driver(String navegador){

       switch (navegador){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(); //Abrindo o Chrome
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver(); //Abrindo o Chrome
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(); //Abrindo o Chrome
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(); //Abrindo o Chrome
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(); //Abrindo o Chrome
                break;
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();  //Maximizando a tela
    }

    public static void visibilityOf(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void invisibilityOf(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
