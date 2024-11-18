package StepDefinitions;

import Task.Seccion1Tap4Task;
import Task.Seccion2Tap4Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class Seccion2Tap4SD {
    @And("presionamos seccion 2")
    public void seccion2() throws InterruptedException, IOException {
        Seccion2Tap4Task test = new Seccion2Tap4Task();
        //Linea 1 Visa Crédito
        test.VisaCreditoT1();
        test.VisaCreditoT2();
        test.VisaCreditoT3();
        test.VisaCreditoT4();
        test.VisaPromedioponderadoU4T();
        //Linea 2 Visa Débito
        test.VisaDebitoT1();
        test.VisaDebitoT2();
        test.VisaDebitoT3();
        test.VisaDebitoT4();
        test.DebitoPromedioponderadoU4T();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
