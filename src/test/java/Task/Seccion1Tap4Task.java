package Task;

import UserInterface.Seccion1Tap4UI;
import Util.config;

public class Seccion1Tap4Task extends config {
    //Linea 1 Domestic On-Us del Tap 1
    public void tap1L1VariableCostMastercard() throws InterruptedException{
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_Mast1.click();
        Thread.sleep(5_000);

    }

    public void tap1L1VariableCostVisa() throws InterruptedException{
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_Visa1.click();
        Thread.sleep(5_000);

    }
    public void FixedCostMastercard() throws InterruptedException {
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_CostofijoMast.click();
        Thread.sleep(5_000);
    }

    public void FixedCostVisa() throws InterruptedException {
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_CostofijoVisa.click();
        Thread.sleep(5_000);
    }

    //Linea 1 Domestic Off-Us del Tap 1

    public void tap1L2VariableCostMastercard() throws InterruptedException{
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_Mast3.click();
        Thread.sleep(5_000);

    }
    public void tap1L2VariableCostVisa() throws InterruptedException{
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_Visa3.click();
        Thread.sleep(5_000);

    }

        public void tap1L2FixedCostMastercard() throws InterruptedException{
            Seccion1Tap4UI type = new Seccion1Tap4UI();
            type.elegimos_Mast4.click();
            Thread.sleep(5_000);

        }
        public void tap1L2FixedCostVisa() throws InterruptedException{
            Seccion1Tap4UI type = new Seccion1Tap4UI();
            type.elegimos_Visa4.click();
            Thread.sleep(5_000);

        }


    //Linea 1 International del Tap 1
    public void tap1L3VariableCostMastercard() throws InterruptedException{
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_Mast5.click();
        Thread.sleep(5_000);

    }
    public void tap1L3VariableCostVisa() throws InterruptedException{
        Seccion1Tap4UI type = new Seccion1Tap4UI();
        type.elegimos_Visa5.click();
        Thread.sleep(5_000);

    }
        public void tap1L3FixedCostMastercard() throws InterruptedException{
            Seccion1Tap4UI type = new Seccion1Tap4UI();
            type.elegimos_Mast6.click();
            Thread.sleep(5_000);

        }
        public void tap1L3FixedCostVisa() throws InterruptedException{
            Seccion1Tap4UI type = new Seccion1Tap4UI();
            type.elegimos_Visa6.click();
            Thread.sleep(5_000);

        }
}
