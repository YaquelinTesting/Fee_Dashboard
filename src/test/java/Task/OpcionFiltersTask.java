package Task;

import UserInterface.OpcionFiltersUI;
import Util.config;

public class OpcionFiltersTask extends config {
    public void Opcionfiltros() throws InterruptedException {
        OpcionFiltersUI menuh = new OpcionFiltersUI();
        menuh.filtrosopcion.click();
        Thread.sleep(5_000);
    }

}
