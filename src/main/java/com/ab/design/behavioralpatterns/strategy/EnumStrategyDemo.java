package com.ab.design.behavioralpatterns.strategy;

/**
 * @author Arpit Bhardwaj
 */
public class EnumStrategyDemo {
    public static void main(String[] args) {
        Player testPlayer = new Player(Strategy.TEST);
        testPlayer.play();

        Player oneDayPlayer = new Player(Strategy.ONE_DAY);
        oneDayPlayer.play();

        Player t20Player = new Player(Strategy.T20);
        t20Player.play();
    }
}

class Player{
    private Strategy battingStrategy;

    public Player(Strategy battingStrategy) {
        this.battingStrategy = battingStrategy;
    }

    public void play(){
        battingStrategy.play();
    }
}

enum Strategy{
    T20{
        @Override
        public void play() {
            System.out.printf("In %s, If it's in the V, make sure it goes to tree %n", name());
        }
    },ONE_DAY{
        @Override
        public void play() {
            System.out.printf("In %s, Push it for Single %n", name());
        }
    },TEST{
        @Override
        public void play() {
            System.out.printf("In %s, Grind them hard %n", name());
        }
    };

    public abstract void play();
}