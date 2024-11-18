package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DescargaExcelUI extends config {
    public WebElement presionamos_DescargaExcel = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div[1]/app-expenses-summary-group/div[1]/button/span"));

}
