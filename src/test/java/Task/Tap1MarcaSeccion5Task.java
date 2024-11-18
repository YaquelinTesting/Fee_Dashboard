package Task;

import UserInterface.Tap1MarcaSeccion5UI;
import Util.config;

public class Tap1MarcaSeccion5Task extends config {
    public void Marcaseccion5() throws InterruptedException {
        Tap1MarcaSeccion5UI FeeDashboardTap1S5 = new Tap1MarcaSeccion5UI();
        FeeDashboardTap1S5.elegimos_MastercardTotal.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_MasdTotalseccion5Total.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_MasdTotalseccion5Issuer.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_MasdTotalseccion5AcquirerMerchant.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_MasdTotalseccion5AcquirerCash.click();
        Thread.sleep(5_000);

        FeeDashboardTap1S5.elegimos_VisaTotal.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_VisaTotalseccion5Total.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_VisaTotalseccion5Issuer.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_VisaTotalseccion5AcquirerMerchant.click();
        Thread.sleep(5_000);
        FeeDashboardTap1S5.elegimos_VisaTotalseccion5AcquirerCash.click();
        Thread.sleep(5_000);
    }
}
