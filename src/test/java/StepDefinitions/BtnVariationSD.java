package StepDefinitions;

import Task.BtnVariationTask;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class BtnVariationSD {
    @Then("presionamos boton variations")
    public void BtnVariation() throws InterruptedException, IOException {
        BtnVariationTask test = new BtnVariationTask();
        test.BtnVariation();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
