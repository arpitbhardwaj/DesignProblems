package com.ab.design.behavioralpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        TwitterStream twitterStream = new TwitterStream();

        Client client = new Client("Arpit");
        Client client1 = new Client("Nish");

        twitterStream.addObserver(client);
        twitterStream.addObserver(client1);

        twitterStream.someoneTweeted();
    }
}
//concrete subject
class TwitterStream extends Observable{
    public void someoneTweeted(){
        setChanged();
        notifyObservers();
    }
}

//concrete observer
class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Update " + name + "'s stream, Someone tweeted!!");
    }
}
