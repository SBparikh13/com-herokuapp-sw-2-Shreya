package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Basetest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();

        //Launch the URL
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //Implicit timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser(){
        driver.quit();
    }
}
