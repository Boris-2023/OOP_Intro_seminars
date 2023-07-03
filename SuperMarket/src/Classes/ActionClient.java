package Classes;

import java.io.IOException;
import java.util.HashMap;

import Interfaces.iActorBehaviour;

/**
 * Class of promoting action client extending class Actor with static field
 * <b>actionClientNum</b> to cross-count action clients, fields <b>actionName</b> and <b>actionClientId</b>
 */
public class ActionClient extends Actor {

    /** field: consequent number of this action client */
    public static int actionClientsNum = 0;

    /** field: name of the action */
    private String actionName;
    /** field: ID of this action client */
    private int actionClientId;

    /**
     * Creating new instance of promotion action client with:
     * 
     * @param name           -> name of the client
     * @param actionName     -> name of the promoting action
     * @param actionClientId -> ID of action client
     * @see ActionClient#ActionClient(String, String, int)
     */
    public ActionClient(String name, String actionName, int actionClientId) {

        super(name + " [участник акции '" + actionName + "' #" + (actionClientsNum + 1) + "]");
        this.actionName = actionName;
        this.actionClientId = actionClientId;

        actionClientsNum++;

    }

    /**
     * method to return Client's name
     * 
     * @see ActionClient#getName()
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * method to check if Client's made an order
     * 
     * @see ActionClient#isMakeOrder()
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * method to check if Client's picked up the order
     * 
     * @see ActionClient#isTakeOrder()
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * method to make an order
     * 
     * @see ActionClient#setMakeOrder()
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * method to pick up the order
     * 
     * @see ActionClient#setTakeOrder()
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    /**
     * method to get data of this Client
     * 
     * @see ActionClient#getActor()
     */
    @Override
    public Actor getActor() {
        return this;
    }

    /**
     * method to process return of goods purshased earlier, returns String
     * specifying the result of operation
     * 
     * @param orderId       -> ID of the order to return (m.b. partially)
     * @param itemsToReturn -> a list of goods to return
     * @param reason        -> reason the Client returns the goods
     * @param compensation  -> total amount the Client is reimbursed for the goods
     *                      returned
     * @see ActionClient#ReturnOrder(long, HashMap, String, double)
     */
    @Override
    public String ReturnOrder(long orderId, HashMap<String, Double> itemsToReturn, String reason, double compensation) {
        return "Возврат по заказу " + orderId + " на общую сумму " + compensation + "успешно оформлен!";
    }

    /**
     * method to get a list of goods to be returned; returns HashMap <String name,
     * Double price>
     * 
     * @see ActionClient#getItemsToReturn()
     */
    @Override
    public HashMap<String, Double> getItemsToReturn() {
        HashMap<String, Double> items = new HashMap<>();
        return items;
    }

    /**
     * method to get a reason the goods are being returned; returns String reason
     * 
     * @see ActionClient#getReturnReason()
     */
    @Override
    public String getReturnReason() {
        return "не хочу!";
    }

    /**
     * method to get total amount of compensatin to the Client for the goods
     * returned; returns Double amount
     * 
     * @see ActionClient#getReimburseAmount()
     */
    @Override
    public Double getReimburseAmount() {

        return 1000.0;
    }

    /**
     * method to check if the number of promoting action clients does not exceed max
     * number allowed and if exceeds reinitializes the client to an Ordinary one; 
     * returns the client depending on the check
     * 
     * @see ActionClient#isMaxPromotionExceed(iActorBehaviour, int)
     */
    public static iActorBehaviour isMaxPromotionExceed(iActorBehaviour client, int maxActionNum) {

        iActorBehaviour cl = client;
        if (actionClientsNum > maxActionNum) {
            // ActionClient by default modifyes name adding promotion related text => needs
            // to trim back the name on the 1st '['-symbol
            String name = client.getActor().getName().split(" \\[")[0];

            String str = name + " не успела поучаствовать в акции и стала обычным клиентом!";
            System.out.println(str);

            cl = new OrdinaryClient(name);

            try {
                logMarket.logString(str);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        return cl;
    }

}
