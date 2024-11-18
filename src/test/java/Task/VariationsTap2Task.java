package Task;

import UserInterface.VariationsTap2UI;
import Util.config;


public class VariationsTap2Task extends config{
    public void Feecategories() throws InterruptedException{
        VariationsTap2UI type = new VariationsTap2UI();
        type.elegimos_categories.click();
        Thread.sleep(5_000);

    }
    public void Expenseevolution() throws InterruptedException{
        VariationsTap2UI exp = new VariationsTap2UI();
        exp.expense.click();
        Thread.sleep(5_000);

    }
    public void Volumenevolution() throws InterruptedException{
        VariationsTap2UI vol = new VariationsTap2UI();
        vol.volumen.click();
        Thread.sleep(5_000);

    }
    public void Cardsevolution() throws InterruptedException{
        VariationsTap2UI card = new VariationsTap2UI();
        card.cards.click();
        Thread.sleep(5_000);

    }
    public void Transactionevolution() throws InterruptedException{
        VariationsTap2UI transc = new VariationsTap2UI();
        transc.transaction.click();
        Thread.sleep(5_000);

    }


}
