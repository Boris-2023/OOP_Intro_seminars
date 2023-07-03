package Classes;

import java.util.List;
import java.util.logging.*;
import java.io.IOException;
import java.util.ArrayList;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Class of the Market implementing interfaces iMarketBehaviour &
 * iQueueBehaviour with private field <b>List<> queue</b>, also performs logging
 * into specified file
 */
public class logMarket implements iMarketBehaviour, iQueueBehaviour {

    private List<iActorBehaviour> queue;
    
    private static Logger logger = Logger.getLogger(logMarket.class.getName());
    private FileHandler fh;

    /**
     * Creating new instance of the market (store) with logging
     * 
     * @param logFile - name of file to put a log
     * 
     * @throws IOException
     * @throws SecurityException
     * 
     * @see logMarket#logMarket()
     */
    public logMarket(String logFile) throws SecurityException, IOException {
        this.queue = new ArrayList<iActorBehaviour>();

        fh = new FileHandler(logFile);
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
    }

    /**
     * method to put a string to the log file
     * 
     * @param string -> string to put
     * @see logMarket#logString(String)
     */
    public static void logString(String string) throws IOException {
        logger.log(Level.INFO, string);
    }

    /**
     * method to introduce the Client to the market & log
     * 
     * @param actor -> the client
     * @see logMarket#acceptToMarket(iActorBehaviour)
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        String str = actor.getActor().getName() + " - клиент пришел в магазин ";
        System.out.println(str);
        try {
            logString(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        takeInQueue(actor);
    }

    /**
     * method to add the Client to the queue & log
     * 
     * @param actor -> the client
     * @see logMarket#takeInQueue(iActorBehaviour)
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        String str = actor.getActor().getName() + " - клиент добавлен в очередь ";
        System.out.println(str);
        try {
            logString(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * method for client to make an order (if not yet done) & log
     * 
     * @see logMarket#giveOrder()
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                String str = actor.getActor().getName() + " - клиент сделал заказ ";
                System.out.println(str);

                try {
                    logString(str);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * method to give the order to client & log
     * 
     * @see logMarket#giveOrder()
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                String str = actor.getActor().getName() + " - клиент получил свой заказ ";
                System.out.println(str);
                try {
                    logString(str);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * method to select and remove clients which have already taken their orders and
     * ready to leave the market & log
     * 
     * @see logMarket#releaseFromQueue()
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                String str = actor.getActor().getName() + " - клиент ушел из очереди ";
                System.out.println(str);
                try {
                    logString(str);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
        releaseFromMarket(releaseActors);
    }

    /**
     * method to remove the clients from the market - leave the market, & log
     * 
     * @param actors -> a list of clients to go out
     * @see logMarket#releaseFromMarket(iActorBehaviour)
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            String str = actor.getName() + " - клиент ушел из магазина ";
            System.out.println(str);
            try {
                logString(str);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            queue.remove(actor);
        }

    }

    /**
     * method to perform market's routine for client (take order, give order and
     * remove from the queue and the market)
     * 
     * @see logMarket#update()
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

}