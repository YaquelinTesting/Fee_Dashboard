package Task;

import UserInterface.PerfilUI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PerfilTask extends config {
    public void perfiltest_seleccionables(String perfil) throws InterruptedException {
        PerfilUI ui = new PerfilUI();
        //Thread.sleep(5_000);
        wait.until(ExpectedConditions.elementToBeClickable(ui.cambiamosperfil));
        ui.cambiamosperfil.click();
        Thread.sleep(8_000);
        ui.cambiamosperfil.sendKeys(perfil);

        Actions actions = new Actions(driver);
        Thread.sleep(5_000);
        actions.sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(5_000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(20_000);
    }
}

