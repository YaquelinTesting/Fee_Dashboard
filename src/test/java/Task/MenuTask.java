package Task;

import UserInterface.MenuUI;
import Util.config;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Objects;

public class MenuTask extends config {

    public void Menu() throws InterruptedException {
        MenuUI menu = new MenuUI();
        wait.until(ExpectedConditions.elementToBeClickable(menu.buscamos_menu));
        menu.buscamos_menu.click();
        Thread.sleep(5_000);
    }

    public void modulo(String modulo) throws InterruptedException {
        MenuUI moduloBilling = new MenuUI();
        if (Objects.equals(modulo, "M&V facturas")) {
            wait.until(ExpectedConditions.elementToBeClickable(moduloBilling.modulo_facturas));
            moduloBilling.modulo_facturas.click();
            Thread.sleep(5_000);
        } else {
            System.out.println("Se ha enviado un modulo diferente: " + modulo);
        }
    }

    public void submodulo(String submodulo) throws InterruptedException {
        MenuUI modulo = new MenuUI();
        Thread.sleep(2_000);
        if (Objects.equals(submodulo, "Fee Dashboard")) {
            wait.until(ExpectedConditions.elementToBeClickable(modulo.submodulo_FeeDashboard));
            modulo.submodulo_FeeDashboard.click();
            //modulo.submoduloFeeDashboard.sendKeys(submodulo);
            Thread.sleep(8_000);
        } else {
            System.out.println("Se ha enviado un submodulo diferente: " + submodulo);
        }

    }
}
