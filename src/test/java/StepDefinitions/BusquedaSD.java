package StepDefinitions;

import Task.BusquedaTask;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class BusquedaSD {
    @Then("realizamos busqueda {}")
    public void Busqueda(String cuota) throws InterruptedException, IOException {
        BusquedaTask test= new BusquedaTask();
        test.Busquedatest();
        test.cuotatest(cuota);
        test.seleccionamoscuotatest();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }

}
