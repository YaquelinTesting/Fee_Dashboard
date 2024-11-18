package StepDefinitions;

import Task.BotonClearTask;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class BotonClearSD {
    @Then("presionamos boton Clear")
    public void Boton_Clear() throws InterruptedException, IOException {
        BotonClearTask test= new BotonClearTask();
        test.BotonCleartest();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();

    }
}
