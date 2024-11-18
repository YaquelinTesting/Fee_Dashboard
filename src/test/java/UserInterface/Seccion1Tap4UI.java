package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Seccion1Tap4UI extends config {
    //Linea 1 Domestic On-Us del Tap 1
    public WebElement elegimos_Mast1 = driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-3\"]/tr[1]/td[2]"));
    public WebElement elegimos_Visa1 = driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-3\"]/tr[1]/td[3]"));
    public WebElement elegimos_CostofijoMast = driver.findElement(By.xpath("//*[@id=\"ListBrandJurisdiction_1_1_1\"]"));
    public WebElement elegimos_CostofijoVisa = driver.findElement(By.xpath("//*[@id=\"ListBrandJurisdiction_1_2_1\"]"));

    //Linea 1 Domestic Off-Us del Tap 1
    public WebElement elegimos_Mast3 = driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-3\"]/tr[2]/td[2]"));
    public WebElement elegimos_Visa3 = driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-3\"]/tr[2]/td[3]"));
    public WebElement elegimos_Mast4 = driver.findElement(By.xpath("//*[@id=\"ListBrandJurisdiction_2_1_1\"]"));
    public WebElement elegimos_Visa4 = driver.findElement(By.xpath("//*[@id=\"ListBrandJurisdiction_2_2_1\"]"));

    //Linea 1 International del Tap 1
    public WebElement elegimos_Mast5 = driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-3\"]/tr[3]/td[2]"));
    public WebElement elegimos_Visa5 = driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-3\"]/tr[3]/td[3]"));
    public WebElement elegimos_Mast6 = driver.findElement(By.xpath("//*[@id=\"ListBrandJurisdiction_16_1_1\"]"));
    public WebElement elegimos_Visa6 = driver.findElement(By.xpath("//*[@id=\"ListBrandJurisdiction_16_2_1\"]"));

}
