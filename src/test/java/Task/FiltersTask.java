package Task;

import UserInterface.FiltersUI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Objects;

import static Util.config.driver;

public class FiltersTask extends config {
    public void Filterstest_seleccionables(String Filtros) throws InterruptedException {
        if(Objects.equals(Filtros, "Customized")){
            FiltersUI tap1Filters = new FiltersUI();
            tap1Filters.seleccionamosfiltros.click();
            Thread.sleep(1_000);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(1_000);
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(2_000);
            actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(5_000);

            System.out.println("Cambiaste el Filters: "+tap1Filters);
        } else {
            System.out.println("Default filtros: "+Filtros);
            Thread.sleep(3_000);
        }

    }
}
