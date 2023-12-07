package org.example;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    List<Actor> queue = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " ������ � �������.");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            queue.remove(actor);
            System.out.println(actor.getName() + " ����� �� ��������.");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " ����� � �������.");
    }

    @Override
    public void takeOrders() {
        for(Actor actor: queue){
            if(!actor.isMakeOrder){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " ������ �����.");
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor: queue){
            if(actor.isMakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " ������� �����.");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue){
            if (actor.isTakeOrder){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " ����� �� �������.");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
