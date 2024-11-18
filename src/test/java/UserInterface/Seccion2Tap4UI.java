package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Seccion2Tap4UI extends config {
    //Linea 1 Visa Crédito

    public WebElement elegimos_VisaCreditoT1 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_8_20232\"]"));
    public WebElement elegimos_VisaCreditoT2 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_8_20233\"]"));
    public WebElement elegimos_VisaCreditoT3 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_8_20234\"]"));
    public WebElement elegimos_VisaCreditoT4 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_8_20241\"]"));
    public WebElement elegimos_VisaPromedioponderadoU4T = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_8_0\"]"));

    //Linea 2 Visa Débito
    public WebElement elegimos_VisaDebitoT1 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_9_20232\"]"));
    public WebElement elegimos_VisaDebitoT2 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_9_20233\"]"));
    public WebElement elegimos_VisaDebitoT3 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_9_20234\"]"));
    public WebElement elegimos_VisaDebitoT4 = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_9_20241\"]"));
    public WebElement elegimos_DebitoPromedioponderadoU4T = driver.findElement(By.xpath("//*[@id=\"ListBrandEvolution_16_2_9_0\"]"));

}
