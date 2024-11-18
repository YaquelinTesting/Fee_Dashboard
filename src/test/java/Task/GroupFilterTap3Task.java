package Task;

import UserInterface.GroupFilterTap3UI;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class GroupFilterTap3Task extends config {
    public void paistap3_seleccionables(String pais) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement paisDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_1\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        paisDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_1_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(pais);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }
    public void marcatap3_seleccionables(String marca) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement marcaDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_2\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        marcaDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_2_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(marca);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }
    public void negociotap3_seleccionables(String negocio) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement negocioDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        negocioDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(negocio);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }
    public void categoriatap3_seleccionables(String categoria) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement categoriaDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_4\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        categoriaDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_4_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(categoria);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }
    public void periodotap3_seleccionables(String periodo) throws InterruptedException {
        if(Objects.equals(periodo, "Agosto 2022")){
            GroupFilterTap3UI negocio = new GroupFilterTap3UI();
            negocio.seleccionamosperiodotap3group.click();
            Thread.sleep(1_000);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.UP).build().perform();
            actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(1_000);

            System.out.println("Cambiaste el Perido: "+negocio);
        } else {
            System.out.println("Default periodo: "+periodo);
            Thread.sleep(3_000);
        }

    }
}
