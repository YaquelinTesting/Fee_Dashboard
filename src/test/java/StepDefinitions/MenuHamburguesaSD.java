package StepDefinitions;

import Task.MenuHamburguesaTask;
import Task.MenuTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class MenuHamburguesaSD {
    @And("presionamos menu hamburguesa")
    public void Menu() throws InterruptedException, IOException {
        MenuHamburguesaTask test = new MenuHamburguesaTask();
        test.Menuhamburguesa();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
