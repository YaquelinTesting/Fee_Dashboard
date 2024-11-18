package StepDefinitions;

import Task.PerfilTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class PerfilSD {
    @And("cambiamos {}")
    public void cambiamos_perfil (String perfil) throws InterruptedException, IOException {
        PerfilTask test= new PerfilTask();
        test.perfiltest_seleccionables(perfil);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
