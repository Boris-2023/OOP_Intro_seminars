package Interfaces;

import java.util.HashMap;

/**
 * Interface specifying processing of return orders; includes methods
 * <b>ReturnOrder</b>(long, HashMap<String, Double>, String, double),
 * <b>getItemsToReturn</b>() , <b>getReturnReason</b>() and
 * <b>getReimburseAmount</b>().
 */
public interface iReturnOrder {

    String ReturnOrder(long orderId, HashMap<String, Double> itemsToReturn, String reason, double compensation);

    HashMap<String, Double> getItemsToReturn();

    String getReturnReason();

    Double getReimburseAmount();

}
