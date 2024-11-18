package Task;

import UserInterface.IdiomasUI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static Util.config.driver;

public class IdiomasTask {
    private static final Logger log = LoggerFactory.getLogger(IdiomasTask.class);

    public void idiomastest(String idioma) throws InterruptedException {
        if(Objects.equals(idioma, "ENG")){
            IdiomasUI user = new IdiomasUI();
            user.seleccionamosidiomas.click();

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.DOWN).build().perform();
            Thread.sleep(5_000);

            actions.sendKeys(Keys.ENTER).build().perform();
            Thread.sleep(8_000);

            System.out.println("Cambiaste el idioma: "+idioma);
        } else {
            System.out.println("Default idioma: "+idioma);

        }

    }
}
