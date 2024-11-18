package Task;

import UserInterface.BtnRelatedFeesUI;
import UserInterface.BusquedaUI;
import UserInterface.PerfilUI;
import Util.config;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BusquedaTask extends config {
    public void Busquedatest() throws InterruptedException {
        BusquedaUI buton = new BusquedaUI();
        buton.presionamos_busqueda.click();
        Thread.sleep(4_000);
    }

    public void cuotatest(String cuota) throws InterruptedException {
        BusquedaUI ui = new BusquedaUI();
        Thread.sleep(5_000);
        ui.buscamoscuota.click();
        Thread.sleep(3_000);
        ui.buscamoscuota.sendKeys(cuota);
        Thread.sleep(5_000);
    }

    public void seleccionamoscuotatest() throws InterruptedException {
        BusquedaUI buton = new BusquedaUI();
        buton.cuota.click();
        Thread.sleep(8_000);
    }
}
