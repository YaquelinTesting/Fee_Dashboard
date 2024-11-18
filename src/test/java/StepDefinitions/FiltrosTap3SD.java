package StepDefinitions;

import Task.FiltrosTap3Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class FiltrosTap3SD {
    @And("seteamos {},{}")
    public void seteamos_Filtros (String marca, String negocio) throws InterruptedException, IOException {
        FiltrosTap3Task test= new FiltrosTap3Task();
        test.Filtrosmarca_seleccionables(marca);
        test.Filtrosnegocio_seleccionables(negocio);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
