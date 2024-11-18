package StepDefinitions;
import Task.Tap4Task;

import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Tap4SD {
    @Then("clickeamos Tap 4 Unit Costs")
    public void Tap4() throws InterruptedException, IOException {
        Tap4Task test= new Tap4Task();
        test.Tap4UnitCosts();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
