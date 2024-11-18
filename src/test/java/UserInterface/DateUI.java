package UserInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Util.config.driver;

public class DateUI {
    public WebElement seteamosfechaStartdate = driver.findElement(By.xpath("//*[@id=\"ej2-datepicker_2\"]/span/span"));
    public WebElement seteamosfechaEnddate = driver.findElement(By.xpath("//*[@id=\"ej2-datepicker_3\"]/span/span"));

}
