package StepDefinitions;

import Task.CountryTask;
import Util.ScreenShot;
import io.cucumber.java.en.And;

import java.io.IOException;

public class CountrySD {
    @And("oprimimos {},{}")
    public void oprimimos (String country, String period) throws InterruptedException, IOException {
        CountryTask test= new CountryTask();
        test.country_seleccionables(country);
        test.period_seleccionables(period);
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();

    }
}
