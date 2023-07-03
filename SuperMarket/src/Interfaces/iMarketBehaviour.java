package Interfaces;

import java.util.List;

import Classes.Actor;
/**
 * Interface specifying behaviour of the market; includes methods
 * <b>acceptToMarket</b>(iActorBehaviour),
 * <b>releaseFromMarket</b>(List<Actor>) and
 * <b>update</b>().
 */
public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actor);
    void update();
    
}
