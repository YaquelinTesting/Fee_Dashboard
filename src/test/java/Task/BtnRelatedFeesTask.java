package Task;

import UserInterface.BotonClearUI;
import UserInterface.BtnRelatedFeesUI;
import Util.config;

public class BtnRelatedFeesTask extends config {
    public void BtnRelatedFeestest() throws InterruptedException {
        BtnRelatedFeesUI buton = new BtnRelatedFeesUI();
        buton.presionamos_boton_realtedfees.click();
        Thread.sleep(8_000);
    }

}
