package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tap1MarcaSeccion5UI extends config {
    public WebElement elegimos_MastercardTotal =  driver.findElement(By.xpath("//*[@id=\"grossFeesMastercardAnalytics\"]/div[4]/div/div"));
    public WebElement elegimos_MasdTotalseccion5Total =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[1]/label"));
    public WebElement elegimos_MasdTotalseccion5Issuer =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[2]/label"));
    public WebElement elegimos_MasdTotalseccion5AcquirerMerchant =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[3]/label"));
    public WebElement elegimos_MasdTotalseccion5AcquirerCash =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[4]/label"));

    public WebElement elegimos_VisaTotal =  driver.findElement(By.xpath("//*[@id=\"grossFeesVisaAnalytics\"]/div[4]/div/div/div"));
    public WebElement elegimos_VisaTotalseccion5Total =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[1]/label"));
    public WebElement elegimos_VisaTotalseccion5Issuer =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[2]/label"));
    public WebElement elegimos_VisaTotalseccion5AcquirerMerchant =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[3]/label"));
    public WebElement elegimos_VisaTotalseccion5AcquirerCash =  driver.findElement(By.xpath("//*[@id=\"rdbtnsMonthlyGrossFeesAnalytics\"]/li[4]/label"));

}
