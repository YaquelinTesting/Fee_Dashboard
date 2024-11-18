package UserInterface;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CredencialesUI extends config {
    public WebElement usuario = driver.findElement(By.id("userLogin"));
    public WebElement password = driver.findElement(By.id("pwd"));
}
