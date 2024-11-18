package Task;

import UserInterface.BusinessUI;
import UserInterface.CountryUI;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class CountryTask extends config {
    public void country_seleccionables(String country) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement countryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_1\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        countryDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_1_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(country);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }

    public void period_seleccionables(String period) throws InterruptedException {
        if(Objects.equals(period, "Agosto 2022")){
            CountryUI negocio = new CountryUI();
            negocio.seleccionamosperiod.click();
            Thread.sleep(1_000);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.UP).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(1_000);

            System.out.println("Cambiaste el Perido: "+negocio);
        } else {
            System.out.println("Default periodo: "+period);
            Thread.sleep(3_000);
        }

    }
}
