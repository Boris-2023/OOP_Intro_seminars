package Interfaces;

/**
 * Interface specifying behaviour of the queue; includes methods
 * <b>takeInQueue</b>(iActorBehaviour),
 * <b>releaseFromQueue</b>(), <b>takeOrder</b>() and
 * <b>giveOrder</b>().
 */
public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);

    void releaseFromQueue();

    void takeOrder();

    void giveOrder();
}
