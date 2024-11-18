package StepDefinitions;

import Task.Tap1MarcaSeccion1Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;


public class Tap1MarcaSeccion1SD {
    @And("clickeamos Seccion 1 Mastercard y Visa")
    public void Marca() throws InterruptedException, IOException {
        Tap1MarcaSeccion1Task test= new Tap1MarcaSeccion1Task();
        test.Marca();
        //test.NewDoc();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
