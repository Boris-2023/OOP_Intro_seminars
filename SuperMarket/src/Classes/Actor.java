package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Abstract class to create the classes of different types of Clients to the Market implementing interfaces of iActorBehaviour & iReturnOrder and using protected fields 
 * <b>name</b>, <b>isTakeOrder</b> and <b>isMakeOrder</b>
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder{
    
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Creating new instance of Client with:
     * 
     * @param name -> name of the client
     * @see Actor#Actor(String)
     */
    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

}
