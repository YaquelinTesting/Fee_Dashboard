package StepDefinitions;

import Task.MenuTask;
import Task.PagFiltersUnitCostTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class PagFiltersUnitCostSD {
    @And("elegimos filtros")
    public void UnitCost() throws InterruptedException, IOException {
        PagFiltersUnitCostTask test = new PagFiltersUnitCostTask();
        test.negocio();
        test.tipotransaccion();
        test.periodo1clic();
        test.periodo2clic();
        test.periodo3clic();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
