package StepDefinitions;

import Task.LogeoTask;
import Util.ScreenShot;
import Util.config;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class LogeoSD extends config {
    @Then("Seleccionamos Generate Token")
    public void Logeo() throws InterruptedException, IOException {
        LogeoTask test= new LogeoTask();
        test.Logeotest();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
