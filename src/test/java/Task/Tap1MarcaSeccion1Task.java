package Task;

import UserInterface.Tap1MarcaSeccion1UI;
import Util.config;

public class Tap1MarcaSeccion1Task extends config {
    public void Marca() throws InterruptedException {
        Tap1MarcaSeccion1UI FeeDashboardTap1 = new Tap1MarcaSeccion1UI();
        FeeDashboardTap1.clickeamos_Mastercard1.click();
        Thread.sleep(5_000);
        FeeDashboardTap1.clickeamos_Mastercard2.click();
        Thread.sleep(5_000);
        FeeDashboardTap1.clickeamos_Mastercard3.click();
        Thread.sleep(5_000);
        FeeDashboardTap1.clickeamos_MastercardTotal.click();
        Thread.sleep(5_000);

        FeeDashboardTap1.clickeamos_Visa1.click();
        Thread.sleep(5_000);
        FeeDashboardTap1.clickeamos_Visa2.click();
        Thread.sleep(5_000);
        FeeDashboardTap1.clickeamos_Visa3.click();
        Thread.sleep(5_000);
        FeeDashboardTap1.clickeamos_VisaTotal.click();
        Thread.sleep(5_000);

    }
}
