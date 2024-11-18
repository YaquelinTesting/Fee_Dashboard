package Task;

import UserInterface.MenuHamburguesaUI;
import Util.config;

public class MenuHamburguesaTask extends config {
    public void Menuhamburguesa() throws InterruptedException {
        MenuHamburguesaUI menuh = new MenuHamburguesaUI();
        menuh.menuhamburguesa.click();
        Thread.sleep(5_000);
    }
}
