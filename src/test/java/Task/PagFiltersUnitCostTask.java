package Task;

import UserInterface.MenuUI;
import UserInterface.PagFiltersUnitCostUI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class PagFiltersUnitCostTask extends config {
    public void negocio() throws InterruptedException {
        PagFiltersUnitCostUI menu = new PagFiltersUnitCostUI();
        menu.elegimos_negocio.click();
        Thread.sleep(10_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3_00);
    }

    public void tipotransaccion() throws InterruptedException{
        PagFiltersUnitCostUI type = new PagFiltersUnitCostUI();
        type.elegimos_tipotransaccion.click();
        Thread.sleep(5_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5_000);
    }

    public void periodo1clic() throws InterruptedException{
        PagFiltersUnitCostUI type = new PagFiltersUnitCostUI();
        type.elegimos_periodo1.click();
        Thread.sleep(5_000);

    }

    public void periodo2clic() throws InterruptedException{
        PagFiltersUnitCostUI type = new PagFiltersUnitCostUI();
        type.elegimos_periodo2.click();
        Thread.sleep(5_000);

    }

    public void periodo3clic() throws InterruptedException{
        PagFiltersUnitCostUI type = new PagFiltersUnitCostUI();
        type.elegimos_periodo3.click();
        Thread.sleep(50_000);

    }

}
