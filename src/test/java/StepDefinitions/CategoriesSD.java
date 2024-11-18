package StepDefinitions;

import Task.CategoriesTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class CategoriesSD {
    @And("elegimos fee categories {},{},{},{},{}")
    public void Boton_RelatedFees(String marca, String negocio, String alcance, String tipotransaccion, String periodo) throws InterruptedException, IOException {
        CategoriesTask test= new CategoriesTask();
        test.brandtest(marca);
        /*test.businesstest(negocio);
        test.scopetest(alcance);
        test.transactiontypetest(tipotransaccion);
        test.periodtest(periodo);*/
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
