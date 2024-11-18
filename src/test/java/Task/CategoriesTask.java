package Task;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CategoriesTask extends config {
    public void brandtest(String marca) throws InterruptedException {

       // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement marcaDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ej2_dropdownlist_2\"]/div/div/span[5]")));

        // Haz clic en el multiselect para abrir las opciones
        marcaDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(2_000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

    // Encuentra el contenedor de las opciones del desplegable (usualmente con la clase e-popup)
    WebElement optionsContainer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_popup\"]/span/span/input")));
    optionsContainer.sendKeys(marca);
    Thread.sleep(2_000);

    WebElement visa = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fefc-0\"]")));
    visa.click();
    Thread.sleep(2_000);




        /*WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(marca);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);*/


    }


   /* public void businesstest(String negocio) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement negocioDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ej2_dropdownlist_3\"]/div/div/span[5]")));

        // Haz clic en el multiselect para abrir las opciones
        negocioDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(negocio);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }*/
    /*public void scopetest(String alcance) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement alcanceDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ej2_dropdownlist_4\"]/div/div/span[5]")));

        // Haz clic en el multiselect para abrir las opciones
        alcanceDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(alcance);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }*/
    /*public void transactiontypetest(String tipotransaccion) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement tipotransaccionDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ej2_dropdownlist_7\"]/div/div/span[5]")));

        // Haz clic en el multiselect para abrir las opciones
        tipotransaccionDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(tipotransaccion);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }*/

    /*public void periodtest(String periodo) throws InterruptedException {

        // Espera hasta que el elemento esté visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement periodoDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ej2_dropdownlist_8\"]/div/div/span[5]")));

        // Haz clic en el multiselect para abrir las opciones
        periodoDropdown.click();

        // Espera un breve periodo para que se desplieguen las opciones
        Thread.sleep(1000); // Ajusta el tiempo si es necesario, pero no debe ser menor de 1 segundo

        WebElement txtNegocio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"_popup\"]/span/span/input")));
        txtNegocio.click();
        txtNegocio.sendKeys(periodo);
        Thread.sleep(1_000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2_00);

    }*/

}
