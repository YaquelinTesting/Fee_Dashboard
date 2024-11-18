package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BusquedaUI extends config {
    public WebElement presionamos_busqueda = driver.findElement(By.xpath("//*[@id=\"dropdownSearch\"]"));
    public WebElement buscamoscuota = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div[1]/app-expenses-detail-group/div/new-table/div[1]/div/div/app-search-input/form/div/div[2]/input"));
    public WebElement cuota = driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-1\"]/tr[2]/td[2]/div/span"));

}
