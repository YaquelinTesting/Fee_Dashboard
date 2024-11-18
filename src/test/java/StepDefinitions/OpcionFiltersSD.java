package StepDefinitions;

import Task.MenuHamburguesaTask;
import Task.OpcionFiltersTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class OpcionFiltersSD {
    @Then("elegimos Filtros")
    public void Filtros() throws InterruptedException, IOException {
        OpcionFiltersTask test = new OpcionFiltersTask();
        test.Opcionfiltros();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
