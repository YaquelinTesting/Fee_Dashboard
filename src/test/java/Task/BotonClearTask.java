package Task;


import UserInterface.BotonClearUI;
import Util.config;

public class BotonClearTask extends config {
    public void BotonCleartest() throws InterruptedException {
        BotonClearUI buton = new BotonClearUI();
        buton.presionamos_boton_clear.click();
        Thread.sleep(5_000);

    }
}
