package Classes;

import java.util.HashMap;

/**
 * Class of Special (VIP) Client extending class Actor with field <b>idVip</b>
 */
public class SpecialClient extends Actor {
    private int idVip;

    /**
     * Creating new instance with specified parameters:
     * 
     * @param name -> name of the Client
     * @param id   -> ID of Special Client
     * @see SpecialClient#SpecialClient(String, int)
     */
    public SpecialClient(String name, Integer id) {
        super(name);
        idVip = id;
    }

    /**
     * method to return Client's name
     * 
     * @see SpecialClient#getName()
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * method to check if Client's made an order
     * 
     * @see SpecialClient#isMakeOrder()
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * method to check if Client's picked up the order
     * 
     * @see SpecialClient#isTakeOrder()
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * method to make an order
     * 
     * @see SpecialClient#setMakeOrder()
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    /**
     * method to pick up the order
     * 
     * @see SpecialClient#setTakeOrder()
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    /**
     * method to get data of this Client
     * 
     * @see SpecialClient#getActor()
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
     * @see SpecialClient#ReturnOrder(long, HashMap, String, double)
     */
    @Override
    public String ReturnOrder(long orderId, HashMap<String, Double> itemsToReturn, String reason, double compensation) {
        return "Возврат по заказу " + orderId + " на общую сумму " + compensation + "успешно оформлен!";
    }

    /**
     * method to get a list of goods to be returned; returns HashMap <String name,
     * Double price>
     * 
     * @see SpecialClient#getItemsToReturn()
     */
    @Override
    public HashMap<String, Double> getItemsToReturn() {
        HashMap<String, Double> items = new HashMap<>();
        return items;
    }

    /**
     * method to get a reason the goods are being returned; returns String reason
     * 
     * @see SpecialClient#getReturnReason()
     */
    @Override
    public String getReturnReason() {
        return "не хочу!";
    }

    /**
     * method to get total amount of compensatin to the Client for the goods
     * returned; returns Double amount
     * 
     * @see SpecialClient#getReimburseAmount()
     */
    @Override
    public Double getReimburseAmount() {

        return 1000.0;
    }

}
