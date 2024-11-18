package StepDefinitions;

import Task.GraficoTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class GraficoSD {
    @And("oprimimos grafico")
    public void Grafico() throws InterruptedException, IOException {
        GraficoTask test = new GraficoTask();
        test.Grafico();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
