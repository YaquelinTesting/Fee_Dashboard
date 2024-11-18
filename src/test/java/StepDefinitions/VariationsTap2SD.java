package StepDefinitions;

import Task.VariationsTap2Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class VariationsTap2SD {

    @And("pasamos clics variations")
    public void Variations() throws InterruptedException, IOException {
        VariationsTap2Task var= new VariationsTap2Task();
        var.Feecategories();
        var.Expenseevolution();
        var.Volumenevolution();
        var.Cardsevolution();
        var.Transactionevolution();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
