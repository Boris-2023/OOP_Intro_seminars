package Interfaces;

import Classes.Actor;

/**
 * интерфейс клиента - набор обязательных требований (методов) к клиенту, чтобы пользоваться маркетом
 */
/**
 * Interface specifying behaviour of the Client to use the Market; includes
 * methods
 * <b>isTakeOrder</b>(), <b>isMakeOrder</b>(), <b>setTakeOrder</b>(boolean),
 * <b>setMakeOrder</b>(boolean) and <b>getActor</b>().
 */
public interface iActorBehaviour {

    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean takeOrder);

    public void setMakeOrder(boolean makeOrder);

    Actor getActor();
}
