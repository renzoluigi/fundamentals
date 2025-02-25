package Exercicios;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new HashSet<>(cards);
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        for (String myCard:myCollection){
            if (!theirCollection.contains(myCard)){
                for (String theirCard:theirCollection){
                    if (!myCollection.contains(theirCard)){
                        return true;
                    }
                }
            }
        } return false;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCards = new HashSet<>(collections.getFirst());
        for (Set<String> s:collections){
            commonCards.retainAll(s);
        } return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>(collections.getFirst());
        for (Set<String> s: collections){
            allCards.addAll(s);
        } return allCards;
    }
}
