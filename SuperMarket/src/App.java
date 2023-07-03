import java.io.IOException;

import Classes.ActionClient;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.SpecialClient;
import Classes.TaxOfficer;
import Classes.logMarket;
import Interfaces.iActorBehaviour;

/**
 * Performs common routine of the market to the client which comes to the
 * market, join the queue, make an order, take the order and leave the market
 */
public class App {
    public static void main(String[] args) throws IOException {

        int maxActionNum = 1;// maximum clients that can participate in promoition action
       
        //without logging
        //Market market = new Market(); 

        //with logging
        String logFile = "log.txt";
        logMarket market = new logMarket(logFile);

        iActorBehaviour client01 = new OrdinaryClient("Борис");
        iActorBehaviour client02 = new SpecialClient("Президент", 101);
        iActorBehaviour client03 = new PensionerClient("Иван Иваныч", 1025);
        iActorBehaviour tax = new TaxOfficer();

        iActorBehaviour client04 = new ActionClient("Петя", "Купи дешевле!", 2001);
        client04 = ActionClient.isMaxPromotionExceed(client04, maxActionNum);

        iActorBehaviour client05 = new ActionClient("Маша", "Купи дешевле!", 2005);
        client05 = ActionClient.isMaxPromotionExceed(client05, maxActionNum);


        market.acceptToMarket(client01);
        market.acceptToMarket(client02);
        market.acceptToMarket(client03);
        market.acceptToMarket(tax);
        market.acceptToMarket(client04);
        market.acceptToMarket(client05);

        market.update();
    }
}
