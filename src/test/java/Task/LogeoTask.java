package Task;

import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class LogeoTask extends config {
    public void Logeotest() throws InterruptedException {
   /* LogeoUI seleccionar = new LogeoUI();
    seleccionar.generate_token_boton.click();
    Thread.sleep(10_000);
    */

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).build().perform(); //PRECIONA ENTER LUEGO DE INGRESAR USERNAME Y PASSWORD
        Thread.sleep(20_000);
    }
}
