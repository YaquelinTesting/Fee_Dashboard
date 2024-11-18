package StepDefinitions;

import Task.Tap1MarcaSeccion1Task;
import Task.Tap2Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class Tap2SD {
    @And("clickeamos Tap 2 Expense Evolution")
    public void Tap2() throws InterruptedException, IOException {
        Tap2Task test= new Tap2Task();
        test.Tap2ExpenseEvolution();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
