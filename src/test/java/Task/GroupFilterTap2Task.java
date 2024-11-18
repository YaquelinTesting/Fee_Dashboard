package Task;

import UserInterface.GroupFilterTap2UI;
import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class GroupFilterTap2Task extends config {
    public void pais_seleccionables(String pais) throws InterruptedException {

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

    public void negocio_seleccionables(String negocio) throws InterruptedException {

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
    public void alcance_seleccionables(String alcance) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alcanceDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        alcanceDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(alcance);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }
    public void periodo_seleccionables(String periodo) throws InterruptedException {
        if(Objects.equals(periodo, "Anual")){
            GroupFilterTap2UI negocio = new GroupFilterTap2UI();
            negocio.seleccionamosperiodo.click();
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
    public void stardate_seleccionables(String stardate) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement stardateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_4.a\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        stardateDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_4.a_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(stardate);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);
    }

    public void enddate_seleccionables(String enddate) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enddateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_4.b\"]/span/span")));

        // Haz clic en el multiselect para abrir las opciones
        enddateDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_4.b_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(enddate);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }
}
