package Task;
import UserInterface.DescargaExcelUI;
import Util.config;

public class DescargaExcelTask extends config {
    public void DescargaExcel() throws InterruptedException {
        DescargaExcelUI buton = new DescargaExcelUI();
        buton.presionamos_DescargaExcel.click();
        Thread.sleep(7_000);
    }
}
