package StepDefinitions;

import Task.ConfigEnvironmentTask;
import Task.Tap3Task;
import Util.ScreenShot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;

import java.io.IOException;

public class Tap3SD {
    @And("clickeamos Tap 3 Expense Details")
    public void Tap3() throws InterruptedException, IOException {
        Tap3Task test= new Tap3Task();
        test.Tap3ExpenseDetails();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
