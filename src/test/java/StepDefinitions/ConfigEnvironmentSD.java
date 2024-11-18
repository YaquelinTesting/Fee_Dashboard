package StepDefinitions;
import Task.ConfigEnvironmentTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class ConfigEnvironmentSD {
    @Before
    public void setup() {
        ConfigEnvironmentTask  tst = new ConfigEnvironmentTask();
        tst.Browser();
    }
    @After
    public void tearDown(){
        ConfigEnvironmentTask test =new ConfigEnvironmentTask();
        test.tear();
    }

    @Given("Ingresamos la url del {},{}")
    public void Enviorement_intelica(String ambiente, String estable){
        ConfigEnvironmentTask test = new ConfigEnvironmentTask();
        test.Environment(ambiente, estable);
    }

}
