package Task;

import UserInterface.Tap4UI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Tap4Task extends config {
    public void Tap4UnitCosts() throws InterruptedException {
        Tap4UI boton = new Tap4UI();
        boton.clickeamos_UnitCosts.click();
        Thread.sleep(10_000);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(25_000);


    }
}
