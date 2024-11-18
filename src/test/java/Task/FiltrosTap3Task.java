package Task;

import UserInterface.FiltersUI;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

import static Util.config.driver;

public class FiltrosTap3Task extends config {
    public void Filtrosmarca_seleccionables(String marca) throws InterruptedException {
        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement marcaDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_1\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        marcaDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_1_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(marca);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }

    public void Filtrosnegocio_seleccionables(String negocio) throws InterruptedException {
        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement negocioDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_2\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        negocioDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_2_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(negocio);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }

}
