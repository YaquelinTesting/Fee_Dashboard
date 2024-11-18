package Task;

import UserInterface.BtnVariationUI;
import Util.config;

public class BtnVariationTask extends config {
    public void BtnVariation() throws InterruptedException {
        BtnVariationUI menu = new BtnVariationUI();
        menu.buscamos_variation.click();
        Thread.sleep(5_000);
    }
}
