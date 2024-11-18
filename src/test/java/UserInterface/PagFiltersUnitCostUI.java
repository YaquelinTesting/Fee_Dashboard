package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PagFiltersUnitCostUI extends config {
    public WebElement elegimos_negocio = driver.findElement(By.xpath("//*[@id=\"SelectBusiness\"]/span/span[2]"));
    public WebElement elegimos_tipotransaccion = driver.findElement(By.xpath("//*[@id=\"SelectTransactionType\"]/span/span[2]"));
    public WebElement elegimos_periodo1 = driver.findElement(By.xpath("//*[@id=\"SelectPeriod\"]/span/span"));
    public WebElement elegimos_periodo2 = driver.findElement(By.xpath("//*[@id=\"SelectPeriod_tree\"]/ul/li[2]/div[2]/div"));
    public WebElement elegimos_periodo3 = driver.findElement(By.xpath("//*[@id=\"SelectPeriod_tree\"]/ul/li[2]/ul/li[1]/div[1]"));
}
