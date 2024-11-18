package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tap2UI extends config {
    public WebElement clickeamos_ExpenseEvolution =  driver.findElement(By.xpath("//*[@id=\"btnEvolutionAnalytics\"]"));

}
