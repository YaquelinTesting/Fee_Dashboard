package StepDefinitions;

import Task.Tap3Seccion1Task;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Tap3Seccion1SD {
    @Then("cambiamos icono flecha")
    public void Tap3Seccion1() throws InterruptedException, IOException {
        Tap3Seccion1Task test= new Tap3Seccion1Task();
        test.Seccion1();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
