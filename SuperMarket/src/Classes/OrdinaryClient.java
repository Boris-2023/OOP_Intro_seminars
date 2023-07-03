package Classes;

import java.util.HashMap;

/**
 * Class of Ordinary Client extending class Actor
 */
public class OrdinaryClient extends Actor {

    /**
     * Creating new instance of Ordinary Client with:
     * 
     * @param name -> name of the client
     * @see OrdinaryClient#OrdinaryClient(String)
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /**
     * method to return Client's name
     * 
     * @see OrdinaryClient#getName()
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * method to check if Client's made an order
     * 
     * @see OrdinaryClient#isMakeOrder()
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * method to check if Client's picked up the order
     * 
     * @see OrdinaryClient#isTakeOrder()
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * method to make an order
     * 
     * @see OrdinaryClient#setMakeOrder()
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * method to pick up the order
     * 
     * @see OrdinaryClient#setTakeOrder()
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    /**
     * method to get data of this Client
     * 
     * @see OrdinaryClient#getActor()
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
     * @see OrdinaryClient#ReturnOrder(long, HashMap, String, double)
     */
    @Override
    public String ReturnOrder(long orderId, HashMap<String, Double> itemsToReturn, String reason, double compensation) {
        return "Возврат по заказу " + orderId + " на общую сумму " + compensation + "успешно оформлен!";
    }

    /**
     * method to get a list of goods to be returned; returns HashMap <String name,
     * Double price>
     * 
     * @see OrdinaryClient#getItemsToReturn()
     */
    @Override
    public HashMap<String, Double> getItemsToReturn() {
        HashMap<String, Double> items = new HashMap<>();
        return items;
    }

    /**
     * method to get a reason the goods are being returned; returns String reason
     * 
     * @see OrdinaryClient#getReturnReason()
     */
    @Override
    public String getReturnReason() {
        return "не хочу!";
    }

    /**
     * method to get total amount of compensatin to the Client for the goods
     * returned; returns Double amount
     * 
     * @see OrdinaryClient#getReimburseAmount()
     */
    @Override
    public Double getReimburseAmount() {

        return 1000.0;
    }

}
