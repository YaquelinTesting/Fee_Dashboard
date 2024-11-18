package StepDefinitions;

import Task.GroupFilterTap2Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class GroupFilterTap2SD {
    @And("llenamos {},{},{},{},{},{}")
    public void llenamos (String pais, String negocio, String alcance, String periodo,String stardate, String enddate) throws InterruptedException, IOException {
        GroupFilterTap2Task test= new GroupFilterTap2Task();
        test.pais_seleccionables(pais);
        test.negocio_seleccionables(negocio);
        test.alcance_seleccionables(alcance);
        test.periodo_seleccionables(periodo);
        test.stardate_seleccionables(stardate);
        test.enddate_seleccionables(enddate);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
