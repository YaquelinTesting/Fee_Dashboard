package StepDefinitions;

import Task.IdiomasTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class IdiomasSD {
    @And("seleccionamos {}")
    public void Idiomas (String idioma) throws InterruptedException, IOException {
        IdiomasTask test= new IdiomasTask();
        test.idiomastest(idioma);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
