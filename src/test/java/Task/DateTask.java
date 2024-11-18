package Task;

import UserInterface.DateUI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static Util.config.driver;

public class DateTask {
    public void date()throws InterruptedException{
        DateUI fecha = new DateUI();
        fecha.seteamosfechaStartdate.click();
        Thread.sleep(3_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2_000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3_000);

        fecha.seteamosfechaEnddate.click();
        Thread.sleep(3_000);
        actions.sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2_000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3_000);

    }
}
