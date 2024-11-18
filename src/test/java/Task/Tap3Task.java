package Task;
import UserInterface.Tap3UI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Tap3Task extends config {

    public void Tap3ExpenseDetails() throws InterruptedException {
        Tap3UI boton = new Tap3UI();
        boton.clickeamos_ExpenseDetails.click();
        Thread.sleep(10_000);


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10_000);
    }
}
