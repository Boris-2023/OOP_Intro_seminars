import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<Product> assort = new ArrayList<>();
        Product item1 = new Product(100, 1, "Lays", 1);
        Product item2 = new Product(50, 2, "cola", 2);
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, (float)0.5);
        Product item4 = new HotDrink(75, 0, "Espresso", 501, 65);
        Product item5 = new HotDrink(50, 0, "Green tea", 502, 60);
        Product item6 = new HotDrink(75, 0, "Hot chocolate", 505);

        //fills in the list with products
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser coinDisp = new CoinDispenser(0);
        Display disp = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDisp, assort, disp);
        
        for (Product prod: venMachine.getProducts()){
            System.out.println(prod);
        }
        
    }
}
