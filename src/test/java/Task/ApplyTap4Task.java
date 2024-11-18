package Task;

import UserInterface.ApplyTap4UI;
import UserInterface.BotonApplyUI;

public class ApplyTap4Task {
    public void Applytest() throws InterruptedException {
        ApplyTap4UI buton = new ApplyTap4UI();
        buton.presionamos_apply.click();
        Thread.sleep(45_000);
    }
}
