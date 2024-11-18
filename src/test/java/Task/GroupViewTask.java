package Task;
import UserInterface.GroupViewUI;
import Util.config;

public class GroupViewTask extends config {
    public void BotonGroupView() throws InterruptedException {
        GroupViewUI buton = new GroupViewUI();
        buton.presionamos_boton_group.click();
        Thread.sleep(5_000);

    }

}
