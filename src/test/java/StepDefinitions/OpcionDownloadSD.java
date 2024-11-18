package StepDefinitions;

import Task.OpcionDownloadTask;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class OpcionDownloadSD {
    @Then("descargamos archivo")
    public void Download() throws InterruptedException, IOException {
        OpcionDownloadTask test = new OpcionDownloadTask();
        test.Opciondownload();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
