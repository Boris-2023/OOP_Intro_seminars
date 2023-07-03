package Classes;

import Interfaces.iActorBehaviour;

/**
 * Class of tax officer implementing interface iActorBehaviour with fields
 * <b>name</b>, <b>isTakeOrder</b> and <b>isMakeOrder</b>
 */
public class TaxOfficer implements iActorBehaviour {
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Creating new instance of Tax Officer, no parameters required -
     * default name "Tax audit"
     */
    public TaxOfficer() {
        this.name = "Tax audit";
    }

    /**
     * method to return Client's name
     * 
     * @see TaxOfficer#getName()
     */
    public String getName() {
        return "Tax audit";
    }

    /**
     * method to check if Client's made an order
     * 
     * @see TaxOfficer#isMakeOrder()
     */
    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    /**
     * method to check if Client's picked up the order
     * 
     * @see TaxOfficer#isTakeOrder()
     */
    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    /**
     * method to make an order
     * 
     * @see TaxOfficer#setMakeOrder()
     */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    /**
     * method to pick up the order
     * 
     * @see TaxOfficer#setTakeOrder()
     */
    @Override
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    /**
     * method to get data of this Client
     * 
     * @see TaxOfficert#getActor()
     */
    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}
