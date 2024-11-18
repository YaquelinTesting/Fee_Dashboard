package StepDefinitions;

import Task.Tap1MarcaSeccion5Task;
import Util.ScreenShot;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

import static Util.config.driver;

public class Tap1MarcaSeccion5SD {
    @Then("elegimos TotalMastercard y TotalVisa")
    public void Marcaseccion5() throws InterruptedException, IOException {
        Tap1MarcaSeccion5Task test= new Tap1MarcaSeccion5Task();
        test.Marcaseccion5();
        //test.NewDoc();
        ScreenShot y = new ScreenShot();
        y.TakeScreenShot();
    }
  /*  @And("seleccionamos las cuotas hijo a eliminar {}")
    public void seleccionamostotal(String buton) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Espera a que el elemento de la opción esté presente y visible en el DOM
        WebElement optionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"int-wrapper\"]/div/app-index/div/div[2]/app-expenses-summary/div" + buton + "')]")));

        // Usa JavaScript para desplazarse al elemento y hacer clic
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionElement);

        Thread.sleep(5_000);
    }*/
}
