package Task;

import UserInterface.CredencialesUI;

public class CredencialesTask {
    public void user(String usuario) throws InterruptedException {
        CredencialesUI user = new CredencialesUI ();
        user.usuario.click();
        user.usuario.sendKeys(usuario);
        //  Thread.sleep(2_000); -- importar
        Thread.sleep(2_000);
    }
    public void password(String contrasena) throws InterruptedException {
        CredencialesUI user = new CredencialesUI();
        user.password.click();
        user.password.sendKeys(contrasena);
        Thread.sleep(2_000);
    }
}
