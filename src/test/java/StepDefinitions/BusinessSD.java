package StepDefinitions;

import Task.BusinessTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class BusinessSD {
    @And("escogemos {},{},{},{},{}")
    public void seteamos_business (String business, String alcance, String transaccion, String starddate, String enddate) throws InterruptedException, IOException {
        BusinessTask test= new BusinessTask();
        test.businesstest_seleccionables(business);
        test.alcancetest_seleccionables(alcance);
        test.transacciontest_seleccionables(transaccion);
        test.starddatetest_seleccionables(starddate);
        test.enddatetest_seleccionables(enddate);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
