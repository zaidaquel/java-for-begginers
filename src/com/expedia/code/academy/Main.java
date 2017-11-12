package com.expedia.code.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player name:");
        String playerName = scanner.nextLine();
        Deck deck = loadDeck();
        Player dealer = loadPlayer(deck, "Dealer");
        Player player = loadPlayer(deck, playerName);
        System.out.println(player.cards() + " Total: " + player.getTotal());

        while (true) {
            String operation = scanner.nextLine();
            if ("hit".equals(operation)) {
                if (dealer.getTotal() < 21) {
                    hit(deck, dealer);
                }
                hit(deck, player);
            } else if ("end".equals(operation)) {
                printResult(dealer, player);
                break;
            } else {
                System.out.println("Please enter a valid operation");
            }
            final boolean f=false;
        }
    }

    private static void printResult(Player dealer, Player player) {
        System.out.println(player);
        System.out.println(dealer);
        if (player.getTotal() <= 21) {
            switch (Integer.compare(dealer.getTotal(), player.getTotal())) {
                case 0:
                    System.out.println("Draw");
                    break;
                case 1:
                    System.out.println("Dealer wins :(");
                    break;
                case -1:
                    System.out.println("You won :)");
                    break;
            }
        } else {
            System.out.println("Dealer wins :(");
        }

    }

    private static Deck loadDeck() {
        Deck deck = new Deck();
        deck.initialize();
        deck.shuffle();
        return deck;
    }

    private static void hit(Deck deck, Player player) {
        try {
            Card card = deck.withdraw();
            player.hit(card);
        } catch (EmptyDeckException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Player loadPlayer(Deck deck, String playerName) {
        Player player = new Player(playerName);
        hit(deck, player);
        hit(deck, player);
        return player;
    }

}