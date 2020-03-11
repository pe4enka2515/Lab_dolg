package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class GameOnDequeue {
    static void outputDeque(Deque deque){
        for (Object element : deque) {
            System.out.print(element + " ");
        }
    }

    static String determineWinner(Deque first, Deque second, int turns){
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
        Deque<Integer> firstPlayer = new ArrayDeque<>();
        firstPlayer.add(3);
        firstPlayer.add(6);
        firstPlayer.add(0);
        firstPlayer.add(2);
        firstPlayer.add(7);

        Deque<Integer> secondPlayer = new ArrayDeque<>();
        secondPlayer.add(9);
        secondPlayer.add(4);
        secondPlayer.add(8);
        secondPlayer.add(1);
        secondPlayer.add(5);

        System.out.print("Игрок 1: ");
        outputDeque(firstPlayer);
        System.out.print("\nИгрок 2: ");
        outputDeque(secondPlayer);
        System.out.println();
        System.out.println();


        int countOfTurns = 0;

        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.peek() > secondPlayer.peek()){
                firstPlayer.addLast(firstPlayer.remove());
                firstPlayer.addLast(secondPlayer.remove());
            }
            else {
                secondPlayer.addLast(secondPlayer.remove());
                secondPlayer.addLast(firstPlayer.remove());
            }
            countOfTurns++;
            System.out.println("Ход №" + countOfTurns);
            outputDeque(firstPlayer);
            System.out.println();
            outputDeque(secondPlayer);
            System.out.println();
            System.out.println();

        }

        System.out.println(determineWinner(firstPlayer, secondPlayer, countOfTurns));
    }
}
