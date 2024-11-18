package StepDefinitions;

import Task.FiltersTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class FiltersSD {
    @And("aplicamos {}")
    public void seleccionamos_Filtros (String filtros) throws InterruptedException, IOException {
        FiltersTask test= new FiltersTask();
        test.Filterstest_seleccionables(filtros);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
