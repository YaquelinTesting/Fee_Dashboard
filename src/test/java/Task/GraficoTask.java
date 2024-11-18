package Task;

import UserInterface.GraficoUI;
import Util.config;

public class GraficoTask extends config {
    public void Grafico() throws InterruptedException {
        GraficoUI menu = new GraficoUI();
        menu.buscamos_Grafico.click();
        Thread.sleep(5_000);

    }
}
