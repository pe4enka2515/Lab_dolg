package com.company;

import java.util.ArrayDeque;
import java.util.Queue;

public class GameOnQueue {

    static void outputQueue(Queue queue){
        for (Object element : queue) {
            System.out.print(element + " ");
        }
    }

    static String determineWinner(Queue first, Queue second, int turns){
        if(turns != 106) {
            if(!first.isEmpty())
                return ("first " + turns);
            else
                return ("second " + turns);
        }
        else
            return "botva";
    }

    public static void main(String[] args) {
        Queue<Integer> firstPlayer = new ArrayDeque<>();
        firstPlayer.add(3);
        firstPlayer.add(6);
        firstPlayer.add(0);
        firstPlayer.add(2);
        firstPlayer.add(7);

        Queue<Integer> secondPlayer = new ArrayDeque<>();
        secondPlayer.add(9);
        secondPlayer.add(4);
        secondPlayer.add(8);
        secondPlayer.add(1);
        secondPlayer.add(5);

        System.out.print("Игрок 1: ");
        outputQueue(firstPlayer);
        System.out.print("\nИгрок 2: ");
        outputQueue(secondPlayer);
        System.out.println();
        System.out.println();

        int countOfTurns = 0;

        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.peek() > secondPlayer.peek()){
                firstPlayer.add(firstPlayer.remove());
                firstPlayer.add(secondPlayer.remove());
            }
            else {
                secondPlayer.add(secondPlayer.remove());
                secondPlayer.add(firstPlayer.remove());
            }
            countOfTurns++;
            System.out.println("Ход №" + countOfTurns);
            outputQueue(firstPlayer);
            System.out.println();
            outputQueue(secondPlayer);
            System.out.println();
            System.out.println();
        }

        System.out.println(determineWinner(firstPlayer, secondPlayer, countOfTurns));
    }
}

