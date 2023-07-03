package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Class of the Market implementing interfaces iMarketBehaviour &
 * iQueueBehaviour with private field <b>List<> queue</b>
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {

    private List<iActorBehaviour> queue;

    /**
     * Creating new instance of the market (store)
     * 
     * @see Market#Market()
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * method to introduce the Client to the market
     * 
     * @param actor -> the client
     * @see Market#acceptToMarket(iActorBehaviour)
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " - клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * method to add the Client to the queue
     * 
     * @param actor -> the client
     * @see Market#takeInQueue(iActorBehaviour)
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " - клиент добавлен в очередь ");
    }

    /**
     * method for client to make an order (if not yet done)
     * 
     * @see Market#giveOrder()
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " - клиент сделал заказ ");

            }
        }

    }

    /**
     * method to give the order to client
     * 
     * @see Market#giveOrder()
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " - клиент получил свой заказ ");
            }
        }

    }

    /**
     * method to select and remove clients which have already taken their orders and
     * ready to leave the market
     * 
     * @see Market#releaseFromQueue()
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " - клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    /**
     * method to remove the clients from the market - leave the market
     * 
     * @param actors -> a list of clients to go out
     * @see Market#releaseFromMarket(iActorBehaviour)
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " - клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    /**
     * method to perform market's routine for client (take order, give order and
     * remove from the queue and the market)
     * 
     * @see Market#update()
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

}