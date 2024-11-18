package StepDefinitions;

import Task.BotonApplyTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class BotonApplySD {
    @And("presionamos boton Apply")
    public void Boton_Apply() throws InterruptedException, IOException {
        BotonApplyTask test= new BotonApplyTask();
        test.BotonApplytest();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
