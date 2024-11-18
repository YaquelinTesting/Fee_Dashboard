package StepDefinitions;

import Task.PagFiltersUnitCostTask;
import Task.Seccion1Tap4Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class Seccion1Tap4SD {
    @And("presionamos seccion 1")
    public void seccion1() throws InterruptedException, IOException {
        Seccion1Tap4Task test = new Seccion1Tap4Task();
        //Linea 1 Domestic On-Us del Tap 1
        test.tap1L1VariableCostMastercard();
        test.tap1L1VariableCostVisa();
        test.FixedCostMastercard();
        test.FixedCostVisa();
        //Linea 1 Domestic Off-Us del Tap 1
        test.tap1L2VariableCostMastercard();
        test.tap1L2VariableCostVisa();
        test.tap1L2FixedCostMastercard();
        test.tap1L2FixedCostVisa();
        //Linea 1 International del Tap 1
        test.tap1L3VariableCostMastercard();
        test.tap1L3VariableCostVisa();
        test.tap1L3FixedCostMastercard();
        test.tap1L3FixedCostVisa();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
