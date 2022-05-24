package br.com.chronosAcademy.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
    private WebDriver driver;

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


        driver.manage().window().maximize();  //Maximizando a tela

    }

    public WebDriver getDriver(){
        return driver;
    }
}
