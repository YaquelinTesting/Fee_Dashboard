package StepDefinitions;

import Task.ApplyTap4Task;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;


public class ApplyTap4SD {

    @Then("pulsamos boton Aplicar")
    public void ApplyTap4() throws InterruptedException, IOException {
        ApplyTap4Task test = new ApplyTap4Task();
        test.Applytest();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }

}
