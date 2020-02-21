import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Convenient
        driver.get("https://selenium.dev");

        driver.navigate().to("https://selenium.dev/documentation/en/");
    }
}
