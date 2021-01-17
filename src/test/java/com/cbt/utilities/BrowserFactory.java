package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    public static WebDriver getDriver (String browser) {

        return null;
    }

    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }
    }
