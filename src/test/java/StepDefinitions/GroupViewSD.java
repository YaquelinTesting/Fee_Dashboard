package StepDefinitions;

import Task.GroupViewTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class GroupViewSD {
    @And("presionamos boton Group view")
    public void Boton_Groupview() throws InterruptedException, IOException {
        GroupViewTask test= new GroupViewTask();
        test.BotonGroupView();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
