package StepDefinitions;

import Task.FiltrosTap4Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class FiltrosTap4SD {
    @And("filtramos {},{}")
    public void seteamosTap4 (String negocio, String TipoTransaccion) throws InterruptedException, IOException {
        FiltrosTap4Task test= new FiltrosTap4Task();
        test.FiltrosnegocioTap4_seleccionables(negocio);
        test.FiltrostipotransaccionTap4_seleccionables(TipoTransaccion);
        test.periodoprimerclic();
        test.periodosegundoclic();
        test.periodotercerclic();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }

}
