package StepDefinitions;

import Task.MenuTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class MenuSD {
    @And("buscamos menu")
    public void Menu() throws InterruptedException, IOException {
        MenuTask test = new MenuTask();
        test.Menu();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }

    @And("buscamos {},{}")
    public void buscar_Modulo_Submodulo(String modulo,String submodulo) throws InterruptedException, IOException {
        MenuTask test= new MenuTask();
        test.modulo(modulo);
        test.submodulo(submodulo);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
