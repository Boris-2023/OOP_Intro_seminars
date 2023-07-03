package Classes;

import java.util.HashMap;

/**
 * Class of Pensioner Client extending class Actor with field <b>pensId</b>
 */
public class PensionerClient extends Actor {
    private int pensId;

    /**
     * Creating new instance with specified parameters:
     * 
     * @param name   -> name of the client
     * @param pensId -> ID of pensioner client
     * @see PensionerClient#PensionerClient(String, int)
     */
    public PensionerClient(String name, int pensId) {
        super(name + " [пенсионер]");
        this.pensId = pensId;
    }

    /**
     * method to return Client's name
     * 
     * @see PensionerClient#getName()
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * method to check if Client's made an order
     * 
     * @see PensionerClient#isMakeOrder()
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * method to check if Client's picked up the order
     * 
     * @see PensionerClient#isTakeOrder()
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * method to make an order
     * 
     * @see PensionerClient#setMakeOrder()
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * method to pick up the order
     * 
     * @see PensionerClient#setTakeOrder()
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    /**
     * method to get data of this Client
     * 
     * @see PensionerClient#getActor()
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
     * @see PensionerClient#ReturnOrder(long, HashMap, String, double)
     */
    @Override
    public String ReturnOrder(long orderId, HashMap<String, Double> itemsToReturn, String reason, double compensation) {
        return "Возврат по заказу " + orderId + " на общую сумму " + compensation + "успешно оформлен!";
    }

    /**
     * method to get a list of goods to be returned; returns HashMap <String name,
     * Double price>
     * 
     * @see PensionerClient#getItemsToReturn()
     */
    @Override
    public HashMap<String, Double> getItemsToReturn() {
        HashMap<String, Double> items = new HashMap<>();
        return items;
    }

    /**
     * method to get a reason the goods are being returned; returns String reason
     * 
     * @see PensionerClient#getReturnReason()
     */
    @Override
    public String getReturnReason() {
        return "не хочу!";
    }

    /**
     * method to get total amount of compensatin to the Client for the goods
     * returned; returns Double amount
     * 
     * @see PensionerClient#getReimburseAmount()
     */
    @Override
    public Double getReimburseAmount() {

        return 1000.0;
    }

}
