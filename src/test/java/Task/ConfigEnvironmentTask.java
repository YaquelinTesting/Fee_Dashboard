package Task;

import Util.config;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class ConfigEnvironmentTask extends config {
    public void Browser(){
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/Drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
    }

    public void tear(){
        driver.quit();
    }

    public void Environment(String ambiente, String estable) {
        String url;
        if ("QA".equals(ambiente)) {
            url = "Si".equals(estable) ? QA : UAT;
        } else if ("UAT".equals(ambiente)) {
            url = "Si".equals(estable) ? UAT : PROD;
        } else {
            throw new IllegalArgumentException("Ambiente no reconocido: " + ambiente);
        }
        driver.get(url);
    }

}
