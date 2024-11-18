package StepDefinitions;

import Task.BtnRelatedFeesTask;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class BtnRelatedFeesSD {
    @Then("presionamos related fees")
    public void Boton_RelatedFees() throws InterruptedException, IOException {
        BtnRelatedFeesTask test= new BtnRelatedFeesTask();
        test.BtnRelatedFeestest();
        //test.Busquedatest();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
