package Task;

import UserInterface.Tap2UI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Tap2Task extends config {
    public void Tap2ExpenseEvolution() throws InterruptedException {
        Tap2UI buton = new Tap2UI();
        buton.clickeamos_ExpenseEvolution.click();
        Thread.sleep(9_000);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5_000);
    }

}
