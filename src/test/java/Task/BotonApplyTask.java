package Task;

import UserInterface.BotonApplyUI;
import Util.config;

public class BotonApplyTask extends config {
    public void BotonApplytest() throws InterruptedException {
        BotonApplyUI buton = new BotonApplyUI();
        buton.presionamos_boton_apply.click();
        Thread.sleep(5_000);
    }
}
