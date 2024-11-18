package StepDefinitions;

import Task.DescargaExcelTask;
import Util.ScreenShot;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class DescargaExcelSD {
    @Then("descargamos excel")
    public void Dowload_Excel() throws InterruptedException, IOException {
        DescargaExcelTask test= new DescargaExcelTask();
        test.DescargaExcel();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
}
