package Task;
import UserInterface.Tap3Seccion1UI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Tap3Seccion1Task extends config {
    public void Seccion1() throws InterruptedException {
        Tap3Seccion1UI buton = new Tap3Seccion1UI();
        buton.seccion1flecha1.click();
        Thread.sleep(10_000);


        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(10_000);
        buton.seccion1flecha2.click();
        Thread.sleep(10_000);

    }
}
