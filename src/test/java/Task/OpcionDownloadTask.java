package Task;

import UserInterface.OpcionDownloadUI;
import Util.config;

public class OpcionDownloadTask extends config {
    public void Opciondownload() throws InterruptedException {
        OpcionDownloadUI descarga = new OpcionDownloadUI();
        descarga.filtrosopciondescarga.click();
        Thread.sleep(8_000);
    }
}
