package StepDefinitions;

import Task.CredencialesTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class CredencialesSD {
    @And("Ingresamos credenciales {},{}")
    public void Inicio_sesion(String usuario,String contrasena) throws InterruptedException, IOException {
        CredencialesTask test= new CredencialesTask();
        test.user(usuario);
        test.password(contrasena);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
