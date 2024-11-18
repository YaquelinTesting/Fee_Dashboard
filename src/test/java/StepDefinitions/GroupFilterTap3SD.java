package StepDefinitions;

import Task.GroupFilterTap2Task;
import Task.GroupFilterTap3Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class GroupFilterTap3SD {
    @And("enviamos {},{},{},{},{}")
    public void enviamos (String pais, String marca, String negocio, String categoria,String periodo) throws InterruptedException, IOException {
        GroupFilterTap3Task test= new GroupFilterTap3Task();
        test.paistap3_seleccionables(pais);
        test.marcatap3_seleccionables(marca);
        test.negociotap3_seleccionables(negocio);
        test.categoriatap3_seleccionables(categoria);
        test.periodotap3_seleccionables(periodo);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
