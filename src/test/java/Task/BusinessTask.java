package Task;
import UserInterface.BusinessUI;
import Util.config;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class BusinessTask extends config {
    public void businesstest_seleccionables(String business) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement businessDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[1]/div/div[2]")));

        // Haz clic en el multiselect para abrir las opciones
        businessDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_1_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(business);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }

    public void alcancetest_seleccionables(String alcance) throws InterruptedException {
        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alcanceDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"HamburgerMenu\"]/div/div[2]/div[2]/app-filter/div[1]/div/div[1]/div[2]/div/div[2]")));

        // Haz clic en el multiselect para abrir las opciones
        alcanceDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_2_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(alcance);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }

    public void transacciontest_seleccionables(String periodo) throws InterruptedException {
        if(Objects.equals(periodo, "Anual")){
            BusinessUI negocio = new BusinessUI();
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

    public void starddatetest_seleccionables(String starddate) throws InterruptedException {
        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement starddateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3.a\"]")));

        // Haz clic en el multiselect para abrir las opciones
        starddateDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3.a_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(starddate);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }
    public void enddatetest_seleccionables(String enddate) throws InterruptedException {
        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement enddateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3.b\"]")));

        // Haz clic en el multiselect para abrir las opciones
        enddateDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"filter_3.b_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(enddate);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3_00);

    }

}
