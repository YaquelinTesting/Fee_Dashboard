package UserInterface;

import Util.config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tap1MarcaSeccion1UI extends config {
    public WebElement clickeamos_Mastercard1 =  driver.findElement(By.xpath("//*[@id=\"grossFeesMastercardAnalytics\"]/div[1]/div"));
    public WebElement clickeamos_Mastercard2 =  driver.findElement(By.xpath("//*[@id=\"grossFeesMastercardAnalytics\"]/div[2]/div/div"));
    public WebElement clickeamos_Mastercard3 =  driver.findElement(By.xpath("//*[@id=\"grossFeesMastercardAnalytics\"]/div[3]/div/div"));
    public WebElement clickeamos_MastercardTotal =  driver.findElement(By.xpath("//*[@id=\"grossFeesMastercardAnalytics\"]/div[4]/div/div"));

    public WebElement clickeamos_Visa1 =  driver.findElement(By.xpath("//*[@id=\"grossFeesVisaAnalytics\"]/div[1]/div/div/div"));
    public WebElement clickeamos_Visa2 =  driver.findElement(By.xpath("//*[@id=\"grossFeesVisaAnalytics\"]/div[2]/div/div"));
    public WebElement clickeamos_Visa3 =  driver.findElement(By.xpath("//*[@id=\"grossFeesVisaAnalytics\"]/div[3]/div/div"));
    public WebElement clickeamos_VisaTotal =  driver.findElement(By.xpath("//*[@id=\"grossFeesVisaAnalytics\"]/div[4]/div/div/div"));


}
