package StepDefinitions;

import Task.DateTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class DateSD {
    @And("seteamos date")
    public void seteamos_Date() throws InterruptedException, IOException {
        DateTask test = new DateTask();
        test.date();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
