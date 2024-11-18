package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogeoUI extends config {
    public WebElement generate_token_boton = driver.findElement(By.xpath("/html/body/app-root/app-login/section[2]/div/div/div/div[3]/button"));

}
